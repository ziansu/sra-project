public void setThresholdInclusive(boolean inclusive) {
    this.inclusive = inclusive;
    if ((diffMeta) != null) {
        diffMeta.getVariableProperties().put("threshold_inclusive", (inclusive ? "true" : "false"));
    }
}