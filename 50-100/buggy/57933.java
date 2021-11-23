private void setScan() {
    double duration = mediaPlayer.getMedia().getDuration().toSeconds();
    double current = mediaPlayer.getCurrentTime().toSeconds();
    double percentage = (current / duration) * 100;
    scanBar.setValue(percentage);
}