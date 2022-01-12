protected java.lang.String[] doInBackground(java.util.ArrayList<java.lang.String>... passing) {
    boolean validServer = false;
    java.lang.String[] result = null;
    try {
        org.eyeseetea.malariacare.network.PushClient pushClient = new org.eyeseetea.malariacare.network.PushClient(null, context);
        validServer = pushClient.isValidServer();
        if (validServer)
            result = pushClient.pullOrgUnitsCodes();
        else
            result[0] = "";
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return result;
}