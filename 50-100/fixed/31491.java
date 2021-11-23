private java.lang.String getTarget(org.eclipse.jdt.core.dom.Expression expression) {
    java.lang.String target = "";
    if (expression != null) {
        target = expression.toString().trim();
        if ((target.isEmpty()) || ("this".equals(target))) {
            return "this";
        }
        if ((!(target.isEmpty())) && (!(isValidIdentifier(target)))) {
            return "";
        }
    }
    return target;
}