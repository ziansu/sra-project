public void stopRecording() {
    if ((this.recorder) != null) {
        try {
            if ((this.state) == (org.apache.cordova.media.AudioPlayer.STATE.MEDIA_RUNNING)) {
                isRecording = false;
                recorder.stop();
                recorder.release();
                recorder = null;
                recordingThread = null;
                this.setState(org.apache.cordova.media.AudioPlayer.STATE.MEDIA_STOPPED);
            }
            this.recorder.release();
            this.moveFile(this.audioFile);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}