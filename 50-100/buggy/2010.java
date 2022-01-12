@java.lang.Override
public edu.gemini.p2checker.rules.gmos.Problem check(edu.gemini.spModel.config2.Config config, int step, edu.gemini.p2checker.rules.gmos.ObservationElements elems, java.lang.Object state) {
    if (((edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config).isIFU()) && (!(edu.gemini.p2checker.rules.gmos.GmosRule.getDisperser(config).isMirror()))) && ((edu.gemini.p2checker.rules.gmos.GmosRule.getYBinning(config)) != (edu.gemini.spModel.gemini.gmos.GmosCommonType.Binning.ONE))) {
        return new edu.gemini.p2checker.rules.gmos.Problem(WARNING, ((edu.gemini.p2checker.rules.gmos.GmosRule.PREFIX) + "IFU_NO_SPATIAL_BINNING_RULE"), errMsg, edu.gemini.p2checker.util.SequenceRule.getInstrumentOrSequenceNode(step, elems));
    }
    return null;
}