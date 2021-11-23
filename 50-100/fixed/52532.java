public static org.apache.tamaya.resource.internal.Locator of(java.lang.String expression) {
    java.util.List<java.lang.String> expressions = new java.util.ArrayList<>();
    for (java.lang.String expr : expression.split("/")) {
        if ((expr.length()) == 0) {
            expressions.add("/");
        }else {
            expressions.add(expr);
        }
    }
    return new org.apache.tamaya.resource.internal.Locator(expressions);
}