public void checkFinished() {
    boolean status = true;
    for (int index : player.getHighlightedFiguresIndizes()) {
        if (stage.getActors().get(index).isVisible()) {
            status = false;
        }
    }
    if ((status && ((kickedIndex) == (-1))) && ((actorActive) == (-1))) {
        setCheatEnabled(false);
        handler.sendMessage(player.getNumber());
    }
}