private void showPass(final android.widget.TextView pwdView, final org.firefli.accountkeeper.model.Account acct) throws EncryptionManager.EncryptionManagerNeedsKeyException, java.security.GeneralSecurityException {
    char[] pwd = acct.getPassword(eManager);
    pwdView.setText(new java.lang.String(pwd));
    java.util.Arrays.fill(pwd, ' ');
}