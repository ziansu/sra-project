private void setScan() {
    if (((mediaPlayer.getMedia()) != null) && ((mediaPlayer.getMedia().getDuration()) != null)) {
        double duration = mediaPlayer.getMedia().getDuration().toSeconds();
        double current = mediaPlayer.getCurrentTime().toSeconds();
        double percentage = (current / duration) * 100;
        scanBar.setValue(percentage);
    }
}