public void addFinish(com.geekeclectic.android.stashcache.StashFabric fabric) {
    if (!(mFinishes.contains(fabric.getId()))) {
        mFinishes.add(fabric.getId());
    }
}