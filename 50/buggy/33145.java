private boolean addJoinableToStructure(@android.support.annotation.NonNull
su.j2e.rvjoiner.RvJoiner.Joinable joinable) {
    boolean wasAdded = joinables.add(joinable);
    if (wasAdded) {
        postStructureChanged();
    }
    return wasAdded;
}