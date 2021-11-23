@java.lang.Override
protected void setValues() {
    super.setValues();
    confirmation = confirmationView.getText().toString();
    authsecret = new com.amanapp.authentication.TwoFactorAuthUtil().generateBase32Secret();
    android.util.Log.d(com.amanapp.application.activities.TAG, (((("confirmation= [" + (confirmation)) + "], authentication secret= [") + (authsecret)) + "]"));
}