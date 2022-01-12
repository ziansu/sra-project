@java.lang.Override
protected void setValues() {
    super.setValues();
    confirmation = confirmationView.getText().toString();
    requestType = ServerRequest.RequestType.CREATE_USER;
    authsecret = new com.amanapp.authentication.TwoFactorAuthUtil().generateBase32Secret();
    android.util.Log.d(com.amanapp.application.activities.TAG, (((((("confirmation= [" + (confirmation)) + "], request type= [") + (requestType)) + "], authentication secret= [") + (authsecret)) + "]"));
}