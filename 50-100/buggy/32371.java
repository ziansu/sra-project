public boolean isDirty() throws java.io.IOException {
    if ((commit) == null)
        return true;
    
    com.beijunyi.parallelgit.utils.io.TreeSnapshot root = fileStore.getRoot().takeSnapshot(false, true);
    assert root != null;
    return commit.getTree().equals(root.getId());
}