@java.lang.Override
public java.lang.Long getLong(java.lang.String expression) {
    java.lang.Object value = this.getValue(expression);
    if (value instanceof java.lang.Number) {
        return ((java.lang.Number) (value)).longValue();
    }
    return null;
}