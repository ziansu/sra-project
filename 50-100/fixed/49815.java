protected java.lang.Boolean doInBackground(java.lang.String... param) {
    boolean result = false;
    java.lang.String orgUnit = param[0];
    try {
        org.eyeseetea.malariacare.network.PushClient pushClient = new org.eyeseetea.malariacare.network.PushClient(context);
        result = pushClient.checkOrgUnit(orgUnit);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    if (result)
        return java.lang.Boolean.TRUE;
    else
        return java.lang.Boolean.FALSE;
    
}