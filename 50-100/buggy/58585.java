private void singleFileChooserEvent() {
    if ((selectedFile) != null) {
        actionStatusLabel.setText(selectedFile.getName());
        selectedMedia = new javafx.scene.media.Media(new java.io.File(selectedFile.getPath()).toURI().toString());
        selectedMediaPlay = new javafx.scene.media.MediaPlayer(selectedMedia);
    }else {
        noMusicError();
    }
}