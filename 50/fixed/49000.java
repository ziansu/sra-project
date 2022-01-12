@java.lang.Override
public void onCreate(java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String password) {
    setProgressBar(getString(R.string.registeringUser), true);
    com.flybits.commons.library.api.idps.FlybitsIDP idp = new com.flybits.commons.library.api.idps.FlybitsIDP(email, password, firstName, lastName);
    connectToFlybits(idp);
}