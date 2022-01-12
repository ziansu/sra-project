protected de.hub.emffrag2.FObjectImpl getRegisteredUserObject(de.hub.emffrag2.Fragment fragment, int id) {
    return userObjectCache.getIfPresent(new de.hub.emffrag2.Fragmentation.UserObjectID(fragment.fFragmentId(), id));
}