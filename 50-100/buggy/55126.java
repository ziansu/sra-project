public void enableDeleteLocalFolderItem() {
    if ((mDeleteLocalFolderItem) == null)
        return ;
    
    try {
        mDeleteLocalFolderItem.setEnabled(((mAccount.countLocalFolders()) > 0));
    } catch (com.fsck.k9.mail.MessagingException e) {
        mDeleteLocalFolderItem.setEnabled(false);
        android.util.Log.e(K9.LOG_TAG, "Can't enable this option: delete a local folder");
    }
}