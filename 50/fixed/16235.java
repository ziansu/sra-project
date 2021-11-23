@java.lang.Override
public java.lang.Integer getInteger(java.lang.String expression) {
    java.lang.Object value = this.getValue(expression);
    if (value instanceof java.lang.Number) {
        return ((java.lang.Number) (value)).intValue();
    }
    return null;
}