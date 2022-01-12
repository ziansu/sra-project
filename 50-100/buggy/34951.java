public java.util.List<org.sosy_lab.cpachecker.cpa.smg.SMGState> reconstructStates() {
    if (isFalse()) {
        throw new java.lang.IllegalStateException("Can't reconstruct state from FALSE-interpolant");
    }else {
        java.util.List<org.sosy_lab.cpachecker.cpa.smg.SMGState> smgStates = new java.util.ArrayList(this.smgStates.size());
        for (org.sosy_lab.cpachecker.cpa.smg.SMGState state : smgStates) {
            smgStates.add(new org.sosy_lab.cpachecker.cpa.smg.SMGState(state));
        }
        return smgStates;
    }
}