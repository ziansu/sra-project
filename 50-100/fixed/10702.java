private void initStreamAudioToServer() throws java.lang.Exception {
    android.util.Log.d(com.ibm.watson.developer_cloud.android.speech_to_text.v1.audio.WebSocketUploader.TAG, "Connecting...");
    this.encoder.initEncoderWithUploader(this);
    if (this.sConfig.isSSL)
        this.trustServer();
    
    boolean rc;
    rc = this.connectBlocking();
    if (rc) {
        android.util.Log.d(com.ibm.watson.developer_cloud.android.speech_to_text.v1.audio.WebSocketUploader.TAG, "Connected");
        this.sendSpeechHeader();
    }else {
        android.util.Log.e(com.ibm.watson.developer_cloud.android.speech_to_text.v1.audio.WebSocketUploader.TAG, "Connection failed!");
        this.uploadPrepared = false;
        throw new java.lang.Exception("Connection failed!");
    }
}