protected boolean isSelectable() throws com.zimbra.common.service.ServiceException {
    if (((!(isVisible())) || (imapFolderStore.isUserRootFolder())) || (imapFolderStore.isIMAPDeleted())) {
        return false;
    }
    return (mReferent) == (this) ? true : mReferent.isSelectable();
}