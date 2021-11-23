private void writeLog(java.lang.String username, int genderID, java.lang.String dB, java.lang.String stage) {
    java.lang.String gender = null;
    android.util.Log.i(ca.uqac.florentinth.speakerauthentication.RecordingActivity.TAG, java.lang.String.valueOf(genderID));
    if (genderID == 0) {
        gender = "Female";
    }else
        if (genderID == 1) {
            gender = "Male";
        }
    
    java.util.List<java.lang.String> values = new java.util.ArrayList<>(java.util.Arrays.asList(username, gender, (dB + "dB"), stage));
    ca.uqac.florentinth.speakerauthentication.Logger.Logger.write(values);
}