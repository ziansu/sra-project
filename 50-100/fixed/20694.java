@java.lang.Override
public void onSuccess(java.util.ArrayList<org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType> result) {
    boolean videoIsPlaying = false;
    for (org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType player : result) {
        if (player.type.equals(PlayerType.GetActivePlayersReturnType.VIDEO))
            videoIsPlaying = true;
        
    }
    queueMediaFile(kodiAddonUrl, (!videoIsPlaying), connection, callbackHandler);
}