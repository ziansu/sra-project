@com.facebook.react.bridge.ReactMethod
public void hide(com.facebook.react.bridge.Promise promise) {
    try {
        if (this.progressDialog.isShowing()) {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        }
        promise.resolve("HIDE");
    } catch (java.lang.Exception e) {
        promise.reject("error");
    }
}