private void detectFaceAndPlayMusic() {
    if (this.jukeBox.isPlayingMusic()) {
        return ;
    }
    if (this.objectDetector.objectDetected()) {
        this.log.info("Face detected.");
        this.jukeBox.playNextSong();
    }else {
        this.log.info("No face detected. JukeBox: {}", this.jukeBox);
    }
}