public com.thebubblenetwork.api.framework.util.mc.scoreboard.BoardPreset getPreset() {
    if ((this) == (com.thebubblenetwork.api.game.BubbleGameAPI.State.LOBBY))
        return com.thebubblenetwork.api.game.BubbleGameAPI.LOBBY;
    else
        if ((((this) == (com.thebubblenetwork.api.game.BubbleGameAPI.State.PREGAME)) || ((this) == (com.thebubblenetwork.api.game.BubbleGameAPI.State.INGAME))) || ((this) == (com.thebubblenetwork.api.game.BubbleGameAPI.State.ENDGAME)))
            return com.thebubblenetwork.api.game.BubbleGameAPI.getInstance().getScorePreset();
        
    
    return null;
}