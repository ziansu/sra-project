public java.util.List<sdk.SDKMessage> get(int userId) {
    java.util.List<sdk.SDKMessage> result = null;
    try {
        sdk.SitchozrServices service = sdk.SitchozrSDK.getInstance().getSitchozrServices();
        result = service.readMessages(userId);
    } catch (java.lang.Exception e) {
        android.util.Log.w(SitchozrSDK.WARNING_TAG, "An error occured while getting message");
    }
    return result;
}