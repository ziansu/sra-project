public void LoadDBFromFingerprintSuccess(boolean fEnrolling) {
    java.lang.String encPass = prefs.getString(((mDbFileName) + (getString(R.string.encrypted_pass))), null);
    if (!fEnrolling) {
        loadDatabase(encPass, mKeyUri, false, true);
    }else {
        loadDatabase(getEditText(R.id.password), mKeyUri, true, false);
    }
}