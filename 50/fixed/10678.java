public boolean check(edu.gemini.spModel.config2.Config config, edu.gemini.p2checker.rules.gmos.ObservationElements elems) {
    final edu.gemini.p2checker.rules.gmos.GmosCommonType.FPUnit fpu = edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config, elems);
    return (fpu == (GmosNorthType.FPUnitNorth.IFU_2)) || (fpu == (GmosSouthType.FPUnitSouth.IFU_2));
}