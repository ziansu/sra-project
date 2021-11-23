@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    try {
        java.lang.Thread.sleep(2000);
    } catch (java.lang.InterruptedException e) {
        return false;
    }
    for (java.lang.String credential : com.trevorhuffsmith.android.trainercustomermanagement.ActivityLogin.DUMMY_CREDENTIALS) {
        java.lang.String[] pieces = credential.split(":");
        if (pieces[0].equals(mUser)) {
            return pieces[1].equals(mPassword);
        }
    }
    return true;
}