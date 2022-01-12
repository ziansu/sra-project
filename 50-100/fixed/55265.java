@java.lang.Override
public void onRenamedFile(de.hub.srcrepo.repositorymodel.Diff diff) {
    de.hub.srcrepo.repositorymodel.AbstractFileRef ref = diff.getFile();
    files.remove(diff.getOldPath());
    removeFile(diff.getOldPath());
    if (ref != null) {
        java.lang.Object file = getFile(ref);
        if (file != null) {
            files.put(diff.getNewPath(), file);
            addFile(diff.getNewPath(), file);
        }
    }
}