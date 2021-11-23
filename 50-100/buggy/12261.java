@java.lang.Override
public com.fsck.k9.mail.Folder getFolder(java.lang.String serverId) {
    if (getStoreSyncKey().equals(com.fsck.k9.mail.store.eas.EasStore.INITIAL_SYNC_KEY)) {
        try {
            getInitialFolderList();
        } catch (com.fsck.k9.mail.MessagingException e) {
            timber.log.Timber.e("Exception encountered while fetching the initial folder list", e);
        }
    }
    synchronized(mFolderList) {
        if (mFolderList.isEmpty()) {
            syncFoldersFromLocalStore();
        }
        return mFolderList.get(serverId);
    }
}