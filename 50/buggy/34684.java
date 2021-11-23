public static void setSpectating(com.thebubblenetwork.api.game.Player p, boolean spectating) {
    if (spectating)
        com.thebubblenetwork.api.game.GameListener.enableSpectate(p);
    else
        com.thebubblenetwork.api.game.GameListener.disableSpectate(p);
    
}