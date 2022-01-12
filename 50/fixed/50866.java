private boolean promptForMic() {
    if (org.apache.cordova.PermissionHelper.hasPermission(this, org.apache.cordova.speech.SpeechRecognition.permissions[org.apache.cordova.speech.SpeechRecognition.RECORD_AUDIO])) {
        audioPermissionGranted = true;
        return audioPermissionGranted;
    }else {
        getMicPermission();
        return audioPermissionGranted;
    }
}