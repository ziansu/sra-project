public boolean isEnabled() {
    if ((file.exists()) && (!(file.canRead())))
        return false;
    
    return (file.SyncropItem.isFileEnabled(file)) && (file.SyncropItem.isPathEnabled(path, owner));
}