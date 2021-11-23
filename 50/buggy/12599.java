@java.lang.Override
protected void onResume() {
    super.onResume();
    updateList_UserStatus(true);
    loadEntireList_UserStatus();
}