@java.lang.Override
public boolean getBoolean(java.lang.String expression) {
    java.lang.Object value = this.getValue(expression);
    if (value instanceof java.lang.Boolean) {
        return java.lang.Boolean.TRUE.equals(value);
    }
    return false;
}