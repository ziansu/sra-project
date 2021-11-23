public static toothpick.Scope openScopes(java.lang.Object... names) {
    if (names == null) {
        throw new java.lang.IllegalArgumentException("null scopes can't be open.");
    }
    toothpick.Scope previousScope;
    toothpick.Scope lastScope = null;
    for (java.lang.Object name : names) {
        previousScope = lastScope;
        lastScope = toothpick.ToothPick.openScope(name);
        if (previousScope != null) {
            previousScope.addChild(lastScope);
        }
    }
    return lastScope;
}