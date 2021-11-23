@javafx.fxml.FXML
private void rewind(javafx.event.Event event) {
    if (((pos) > 0) && (((player().position()) == 0) || (((java.lang.System.currentTimeMillis()) - (lastRewind)) < (skipbackTimeout)))) {
        player().pause();
        (pos)--;
        configurePlayer();
    }
    lastRewind = java.lang.System.currentTimeMillis();
    player().cue(0);
}