private int calculateDiscardNum() {
    if ((model) == null)
        return 0;
    
    java.util.ArrayList<model.Player> players = model.getPlayers();
    int halfcards = (thisplayer.getResources().getSize()) / 2;
    java.lang.System.out.println(("DISCARD:max discard num= " + halfcards));
    return halfcards;
}