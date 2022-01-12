private void addNewHit(org.gearvrf.GVRSceneObject object) {
    if (previousHits.contains(object)) {
        previousHits.remove(object);
    }
    if ((intersecting.contains(object)) == false) {
        intersecting.add(object);
    }
    newHits.add(object);
}