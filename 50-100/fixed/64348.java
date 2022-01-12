public boolean isEnabled() {
    if ((file.exists()) && (!(file.canRead())))
        return false;
    
    if (path.isEmpty())
        return true;
    
    return (file.SyncropItem.isFileEnabled(file)) && (file.SyncropItem.isPathEnabled(path, owner));
}