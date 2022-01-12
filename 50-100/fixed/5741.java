@java.lang.Override
public boolean apply(final java.lang.String filename) {
    try {
        final org.eclipse.jgit.treewalk.TreeWalk pathWalk = org.eclipse.jgit.treewalk.TreeWalk.forPath(_r, filename, _tree.getId());
        if (pathWalk == null)
            return true;
        
        final org.eclipse.jgit.lib.FileMode fileMode = pathWalk.getFileMode(0);
        return (fileMode != (org.eclipse.jgit.lib.FileMode.GITLINK)) && (fileMode != (org.eclipse.jgit.lib.FileMode.SYMLINK));
    } catch (final java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}