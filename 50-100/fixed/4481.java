public void addChild(toothpick.Scope child) {
    if (child == null) {
        throw new java.lang.IllegalArgumentException("Child must be non null.");
    }
    if ((child.parentScope) == (this)) {
        return ;
    }
    if ((child.parentScope) != null) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Injector %s already has a parent: %s", child, child.parentScope));
    }
    childrenScopes.add(child);
    child.parentScope = this;
    child.parentScopes.add(this);
    child.parentScopes.addAll(parentScopes);
}