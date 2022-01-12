@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    try {
        java.lang.Thread.sleep(2000);
    } catch (java.lang.InterruptedException e) {
        return false;
    }
    for (java.lang.String credential : ca.ualberta.cmput301w16t18.gamexchange.LoginActivity.DUMMY_CREDENTIALS) {
        java.lang.String[] pieces = credential.split(":");
        if (pieces[0].equals(mEmail)) {
            return pieces[1].equals(mPassword);
        }
    }
    return false;
}