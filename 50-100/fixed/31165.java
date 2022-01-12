protected boolean isSelectable() throws com.zimbra.common.service.ServiceException {
    if (((((imapFolderStore) == null) || (!(isVisible()))) || (imapFolderStore.isUserRootFolder())) || (imapFolderStore.isIMAPDeleted())) {
        return false;
    }
    return (mReferent) == (this) ? true : mReferent.isSelectable();
}