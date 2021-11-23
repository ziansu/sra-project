public boolean matches(edu.gemini.spModel.config2.Config config, int step, edu.gemini.p2checker.rules.gmos.ObservationElements elems) {
    if (!(SequenceRule.SCIENCE_MATCHER.matches(config, step, elems)))
        return false;
    
    edu.gemini.p2checker.rules.gmos.GmosCommonType.Disperser disperser = edu.gemini.p2checker.rules.gmos.GmosRule.getDisperser(config);
    edu.gemini.p2checker.rules.gmos.GmosCommonType.FPUnit fpu = edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config);
    return ((!((disperser == null) || (fpu == null))) && (disperser.isMirror())) && (fpu.isImaging());
}