public int getOutcome(java.lang.Long t) {
    return ((int) ((getActualOutcome(t)) >> (offset[targetVar])));
}