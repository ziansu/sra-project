@java.lang.Override
public void onError(java.lang.Exception ex) {
    android.util.Log.e(com.ibm.watson.developer_cloud.android.speech_to_text.v1.audio.WebSocketUploader.TAG, "WebSocket error");
    if (ex != null)
        android.util.Log.e(com.ibm.watson.developer_cloud.android.speech_to_text.v1.audio.WebSocketUploader.TAG, ex.getMessage());
    
    this.uploadPrepared = false;
    if ((delegate) != null) {
        delegate.onError(ex.getMessage());
    }
}