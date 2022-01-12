public boolean check(edu.gemini.spModel.config2.Config config, edu.gemini.p2checker.rules.gmos.ObservationElements elems) {
    if ((elems.getInstrument()) instanceof edu.gemini.p2checker.rules.gmos.InstGmosSouth) {
        _message = MESSAGE_SOUTH;
    }else {
        _message = MESSAGE_NORTH;
    }
    return !(edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config, elems).isNS());
}