public void playFile(com.switchpool.model.SPFile file) {
    player.stop();
    java.lang.String fileParh = (getString(R.string.SPAudioFilePrefix)) + (file.getFid());
    for (int i = 0; i < (data.size()); i++) {
        java.lang.String pathString = data.get(i);
        if (getFileName(pathString).equals(fileParh)) {
            curIndex = i;
            play();
        }
    }
}