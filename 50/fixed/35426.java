@java.lang.Override
public void onRecordingSuccessful(java.io.File file) {
    if (file != null)
        sendBinaryMessage(android.net.Uri.fromFile(file), AudioDialog.DEFAULT_MIME, false, org.kontalk.message.AudioComponent.class);
    
}