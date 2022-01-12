public boolean matches(edu.gemini.spModel.config2.Config config, int step, edu.gemini.p2checker.rules.gmos.ObservationElements elems) {
    if (!(SequenceRule.SCIENCE_MATCHER.matches(config, step, elems)))
        return false;
    
    return (edu.gemini.p2checker.rules.gmos.GmosRule.getDisperser(config).isMirror()) && (edu.gemini.p2checker.rules.gmos.GmosRule.getFPU(config, elems).isImaging());
}