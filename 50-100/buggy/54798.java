@java.lang.Override
protected void onCurrentProfileChanged(com.facebook.Profile oldProfile, com.facebook.Profile currentProfile) {
    try {
        if (currentProfile == null) {
            MainActivity.displayText.setText("");
        }else
            if (currentProfile != null) {
                displayToast((("Welcome Back " + (currentProfile.getName())) + "!"));
                com.example.sam.bookbag.FacebookLogin.profile = currentProfile;
            }
        
    } catch (java.lang.NullPointerException NPE) {
        android.util.Log.e("New Profile", "NULL");
    }
}