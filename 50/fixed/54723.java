public N apply(java.lang.Object model) {
    N node = createNode(null);
    new org.genericsystem.ui.ViewContext(null, new org.genericsystem.ui.ModelContext(null, this, model), this, node);
    return node;
}