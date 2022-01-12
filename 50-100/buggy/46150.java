@java.lang.Override
public java.lang.String getString(java.lang.String expression) {
    java.lang.Object value = com.skin.ayada.ognl.util.OgnlUtil.getValue(expression, this, this);
    if ((value == null) || (value instanceof com.skin.ayada.ognl.util.Empty<?, ?>)) {
        return "";
    }
    return value.toString();
}