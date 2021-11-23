private void createLocalFolder() {
    java.lang.String title = getString(R.string.local_folder_create);
    try {
        com.fsck.k9.mailstore.LocalStore ls = mAccount.getLocalStore();
        com.fsck.k9.fragment.CreateLocalFolderDialog d = com.fsck.k9.fragment.CreateLocalFolderDialog.newInstance(title, mAccount);
        d.show(getFragmentManager(), title);
    } catch (com.fsck.k9.mail.MessagingException e) {
        android.util.Log.e(K9.LOG_TAG, "Unable to create a local folder", e);
    }
}