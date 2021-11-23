@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((recorder) != null)
        recorder.stopRecording();
    
    recorder = null;
    if ((_encoder) != null) {
        _encoder.disconnectAudioSource();
        _encoder.release();
    }
    _encoder = null;
    if ((_cloudRecognizer) != null)
        _cloudRecognizer.cancel();
    
    _cloudRecognizer = null;
    if ((_cloudServices) != null)
        _cloudServices.release();
    
    _cloudServices = null;
    _ttsService.close();
}