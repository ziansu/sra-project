@java.lang.Override
public com.lyndir.masterpassword.MasterKey call() throws java.lang.Exception {
    try {
        return com.lyndir.masterpassword.MasterKey.create(version, fullName, masterPassword);
    } catch (java.lang.Exception e) {
        sitePasswordField.setText("");
        progressView.setVisibility(View.INVISIBLE);
        com.lyndir.masterpassword.EmergencyActivity.logger.err(e, "While generating master key.");
        throw e;
    }
}