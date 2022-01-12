public void createGamefield() {
    if ((playerList) == null)
        playerList = new java.util.ArrayList<>();
    
    if ((playerList.size()) < 1) {
        createGameField(chordImpl.getID());
        java.util.Collections.sort(playerList);
        playerList.remove(ownPlayer);
        de.haw.ttv2.main.GUIMessageQueue.getInstance().addMessage("Field Created!");
    }
}