public void registerUserObject(de.hub.emffrag2.Fragment fragment, int id, de.hub.emffrag2.FObjectImpl fObject) {
    userObjectCache.put(new de.hub.emffrag2.Fragmentation.UserObjectID(fragment.fFragmentId(), id), fObject);
}