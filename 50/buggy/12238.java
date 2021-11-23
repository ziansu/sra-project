public void toggleButton() {
    if (playButton.getId().equals("playButton")) {
        playButton.setId("pauseButton");
    }else {
        playButton.setId("playButton");
    }
}