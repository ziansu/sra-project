public eu.nullbyte.android.urllib.Urllib login() throws com.liato.bankdroid.banking.exceptions.BankException, com.liato.bankdroid.banking.exceptions.LoginException, java.io.IOException {
    com.liato.bankdroid.banking.banks.LoginPackage lp = preLogin();
    java.lang.String response = urlopen.open(lp.getLoginTarget(), lp.getPostData());
    return urlopen;
}