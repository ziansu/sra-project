@java.lang.Override
public void onError(java.lang.Exception ex) {
    android.util.Log.e(com.ibm.watson.developer_cloud.android.speech_to_text.v1.audio.WebSocketUploader.TAG, "WebSocket error");
    java.lang.String errorMessage = "";
    if (ex != null)
        errorMessage = ex.getMessage();
    
    this.close(1000, errorMessage);
    this.isConnected = false;
    this.isReadyForAudio = false;
    this.isReadyForClosure = false;
    if ((delegate) != null) {
        delegate.onError(errorMessage);
    }
}