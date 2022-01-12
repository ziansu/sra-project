@java.lang.Override
public boolean share(java.lang.String noteId, java.lang.String owner, java.lang.String newOwner) throws java.io.IOException {
    org.apache.commons.vfs2.FileObject rootDir = fsManager.resolveFile(getPath(("/users/" + owner)));
    org.apache.commons.vfs2.FileObject noteDir = rootDir.resolveFile(noteId, NameScope.CHILD);
    return getNote(noteDir).getOwners().add(newOwner);
}