private boolean isSubDirectory(hudson.FilePath parent, hudson.FilePath child) {
    hudson.FilePath parentFolder = child;
    while (parentFolder != null) {
        if (parent.equals(parentFolder)) {
            return true;
        }
        parentFolder = child.getParent();
    } 
    return false;
}