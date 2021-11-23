public java.util.Collection<soottocfg.cfg.Variable> getOutParams() {
    final java.util.List<soottocfg.cfg.Variable> rtr = new java.util.ArrayList<soottocfg.cfg.Variable>();
    if ((returnVariable) != null) {
        rtr.add(returnVariable);
    }
    if ((exceptionalReturnVariable) != null) {
        rtr.add(exceptionalReturnVariable);
    }
    return rtr;
}