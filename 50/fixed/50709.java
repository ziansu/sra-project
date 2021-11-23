@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... strings) {
    temp = com.webwemser.letsmeetapp.MainActivity.meets;
    try {
        com.webwemser.letsmeetapp.MainActivity.meets = webservice.getMeetsByUser(LoginActivity.session.getSessionData().getSessionID());
    } catch (java.lang.Exception e) {
    }
    return "";
}