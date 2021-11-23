private void rewriteParents(int from, int to) {
    wyrw.util.IncrementalAutomatonMinimiser.ParentInfo fromParents = parents.get(from);
    wyrw.util.IncrementalAutomatonMinimiser.ParentInfo toParents = parents.get(to);
    if (toParents == null) {
        parents.set(to, fromParents);
        addParentToChildren(to);
    }else {
        toParents.addAll(fromParents);
    }
    parents.set(from, null);
}