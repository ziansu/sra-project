protected void updateServer(com.amplitude.api.Amplitude.UploadCallback callback) {
    callback = (callback == null) ? com.amplitude.api.AmplitudeClient.EMPTY : callback;
    updateServer(false, callback);
}