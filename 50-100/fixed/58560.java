public void run() {
    try {
        com.google.firebase.iid.FirebaseInstanceId.getInstance().deleteInstanceId();
        java.lang.String currentToken = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
        if (currentToken != null) {
            org.apache.cordova.firebase.FirebasePlugin.sendToken(currentToken);
        }
        callbackContext.success();
    } catch (java.lang.Exception e) {
        callbackContext.error(e.getMessage());
    }
}