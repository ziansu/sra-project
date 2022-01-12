public void uploadContacts(java.lang.String path) {
    com.seafile.seadroid2.account.Account camAccount = mSettingsFragment.contactsManager.getContactsAccount();
    if ((camAccount != null) && ((mSettingsFragment.settingsMgr.getCameraUploadRepoName()) != null)) {
        java.lang.String repoName = mSettingsFragment.settingsMgr.getContactsUploadRepoName();
        java.lang.String repoId = mSettingsFragment.settingsMgr.getContactsUploadRepoId();
        txService.addTaskToUploadQue(camAccount, repoId, repoName, "/", path, false, true);
    }
}