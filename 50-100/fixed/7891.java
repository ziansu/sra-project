@java.lang.SuppressWarnings(value = "unchecked")
private com.strobel.decompiler.ast.Expression updateCurrent(com.strobel.decompiler.ast.Expression node) {
    if ((node != null) && (node != (Node.NULL))) {
        if (node == scope) {
            return null;
        }
        node = parentLookup.get(node);
        return node;
    }
    return null;
}