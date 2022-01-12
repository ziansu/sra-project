public java.util.List<com.google.devtools.build.lib.events.Location> getLockLocations(com.google.devtools.build.lib.syntax.Mutability.Freezable object) {
    if (!(isLocked(object))) {
        throw new java.lang.AssertionError("trying to get lock locations for an object that is not locked");
    }
    return lockedItems.get(object);
}