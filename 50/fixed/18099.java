public static java.lang.Object getValue(java.lang.String expression, ognl.OgnlContext context, java.lang.Object root) throws java.lang.Exception {
    return ognl.Ognl.getValue(com.skin.ayada.ognl.util.OgnlUtil.compile(expression), context, root);
}