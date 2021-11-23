public void SGFingerPresentCallback() {
    autoOn.stop();
    fingerDetectedHandler.sendMessage(new android.os.Message());
}