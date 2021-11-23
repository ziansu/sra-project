public boolean check(edu.gemini.spModel.config2.Config config, edu.gemini.p2checker.rules.gmos.ObservationElements elems) {
    edu.gemini.p2checker.rules.gmos.GmosCommonType.Filter filter = edu.gemini.p2checker.rules.gmos.GmosRule.getFilter(config);
    if (!(filter.isNone()))
        return false;
    
    final edu.gemini.p2checker.rules.gmos.GmosCommonType.FPUnit fpu = edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config, elems);
    return (fpu == (GmosNorthType.FPUnitNorth.IFU_1)) || (fpu == (GmosSouthType.FPUnitSouth.IFU_1));
}