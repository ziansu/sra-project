public java.lang.Boolean getAutoFormatValue() {
    if ("is".equalsIgnoreCase(getOperator())) {
        return false;
    }
    if ("is not".equalsIgnoreCase(getOperator())) {
        return false;
    }
    if ("in".equalsIgnoreCase(getOperator())) {
        return false;
    }
    if ("not in".equalsIgnoreCase(getOperator())) {
        return false;
    }
    return this.autoFormatValue;
}