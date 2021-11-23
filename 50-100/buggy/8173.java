protected void refreshView() throws com.fsck.k9.mail.MessagingException {
    mAdapter.setNotifyOnChange(false);
    mAdapter.clear();
    mLocalFolders = mAccount.getLocalFolders();
    for (com.fsck.k9.mailstore.LocalFolder lf : mLocalFolders) {
        mAdapter.add(lf.getName());
    }
    mAdapter.notifyDataSetChanged();
}