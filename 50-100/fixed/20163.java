public postit.server.model.ServerKeychain getKeychain(java.lang.String username, long directoryEntryId) {
    postit.server.model.ServerKeychain entry = db.getDirectoryEntry(directoryEntryId);
    if (entry == null) {
        return null;
    }
    boolean isOwner = entry.getOwnerUsername().equals(username);
    boolean isShared = java.util.Objects.equals(entry.getSharedUsername(), username);
    if (isOwner || isShared) {
        return entry;
    }else {
        return null;
    }
}