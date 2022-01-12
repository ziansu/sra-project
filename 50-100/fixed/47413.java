private int calculateDiscardNum() {
    if ((model) == null)
        return 0;
    
    java.util.ArrayList<model.Player> players = model.getPlayers();
    int halfcards = (thisplayer.getResources().getSize()) / 2;
    return halfcards;
}