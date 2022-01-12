public void stopRecording() {
    if ((this.recorder) != null) {
        try {
            if ((this.state) == (org.apache.cordova.media.AudioPlayer.STATE.MEDIA_RUNNING)) {
                this.recorder.stop();
                this.recorder.release();
                this.recorder = null;
                this.recordingThread = null;
                isRecording = false;
                this.setState(org.apache.cordova.media.AudioPlayer.STATE.MEDIA_STOPPED);
            }
            this.moveFile(this.audioFile);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}