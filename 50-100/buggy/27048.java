private void shoot() {
    if ((playerList.size()) > 1) {
        de.haw.ttv2.main.Player target = playerList.get(randBetween(0, playerList.size()));
        de.haw.ttv2.main.Sector targetSector = target.getPlayerFields()[randBetween(0, target.getPlayerFields().length)];
        chordImpl.retrieve(targetSector.getMiddle());
    }else
        de.haw.ttv2.main.GUIMessageQueue.getInstance().addMessage("Keine Spieler vorhanden!");
    
}