public void changeModes() {
    if (SpellingList.playingTrack2) {
        spelling.ContentPlayers.AudioPlayer.stopSound();
    }
    SpellingList.playingTrack2 = false;
    languageSelect.setVisible(false);
    addList.setVisible(false);
    help.setVisible(false);
    frame.getContentPane().remove(tabs);
    controller.setVisible(true);
    if (!(notFirstTime)) {
        window.setText("");
        notFirstTime = true;
    }
    window.setText("");
}