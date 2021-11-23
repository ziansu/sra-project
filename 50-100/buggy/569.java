public boolean isLocked(com.google.devtools.build.lib.syntax.Mutability.Freezable object) {
    if (!(object.mutability().equals(this))) {
        throw new java.lang.AssertionError("trying to check the lock of an object from a different context");
    }
    if (!(isMutable)) {
        return false;
    }
    java.lang.Integer hash = java.lang.System.identityHashCode(object);
    return lockedItems.containsKey(hash);
}