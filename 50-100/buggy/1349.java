protected java.lang.String[] doInBackground(java.util.ArrayList<java.lang.String>... passing) {
    java.lang.String[] result = null;
    try {
        org.eyeseetea.malariacare.network.PushClient pushClient = new org.eyeseetea.malariacare.network.PushClient(((android.app.Activity) (getContext())));
        result = pushClient.pullOrgUnitsCodes();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return result;
}