public void setExpressionParts(java.util.List<@org.eclipse.jdt.annotation.NonNull
E> expressionParts) {
    synchronized(this) {
        java.util.Collections.sort(expressionParts);
        this.expressionParts = java.util.Collections.unmodifiableList(new java.util.LinkedList<>(expressionParts));
    }
}