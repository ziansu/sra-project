public void changeModes() {
    SpellingList.playingTrack2 = false;
    if (!(SpellingList.playingTrack2)) {
        spelling.ContentPlayers.AudioPlayer.stopSound();
    }
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