protected int getIndexOfPath(hudson.plugins.git.GitChangeSet.Path path) throws java.io.IOException {
    final java.lang.String pathAsString = path.getPath();
    final hudson.plugins.git.GitChangeSet changeSet = path.getChangeSet();
    int i = 0;
    boolean found = false;
    for (java.lang.String affected : changeSet.getAffectedPaths()) {
        int res = affected.compareTo(pathAsString);
        if (res == 0)
            found = true;
        else
            if (res < 0)
                i++;
            
        
    }
    return i;
}