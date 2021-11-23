org.eclipse.jetty.util.PathWatcher.DirAction handleDir(java.nio.file.Path path) {
    try {
        if (!(java.nio.file.Files.isDirectory(path)))
            return org.eclipse.jetty.util.PathWatcher.DirAction.IGNORE;
        
        if ((excludeHidden) && (java.nio.file.Files.isHidden(path)))
            return org.eclipse.jetty.util.PathWatcher.DirAction.IGNORE;
        
        if ((getRecurseDepth()) == 0)
            return org.eclipse.jetty.util.PathWatcher.DirAction.WATCH;
        
        return org.eclipse.jetty.util.PathWatcher.DirAction.ENTER;
    } catch (java.lang.Exception e) {
        org.eclipse.jetty.util.PathWatcher.LOG.ignore(e);
        return org.eclipse.jetty.util.PathWatcher.DirAction.IGNORE;
    }
}