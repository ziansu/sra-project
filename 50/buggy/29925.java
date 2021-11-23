@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.ibm.mobilefirstplatform.clientsdk.android.security.facebookauthentication.FacebookAuthenticationManager.getInstance().onActivityResultCalled(requestCode, resultCode, data);
}