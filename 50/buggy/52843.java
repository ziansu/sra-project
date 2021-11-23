@java.lang.Override
public java.lang.Float getFloat(java.lang.String expression) {
    java.lang.Object value = com.skin.ayada.ognl.util.OgnlUtil.getValue(expression, this, this);
    if (value instanceof java.lang.Number) {
        return ((java.lang.Number) (value)).floatValue();
    }
    return null;
}