@java.lang.Override
public void onSuccess(java.util.ArrayList<org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType> result) {
    boolean videoIsPlaying = false;
    for (org.xbmc.kore.jsonrpc.type.PlayerType.GetActivePlayersReturnType player : result) {
        if (player.type.equals(PlayerType.GetActivePlayersReturnType.VIDEO))
            videoIsPlaying = true;
        
    }
    if (videoIsPlaying) {
        org.xbmc.kore.utils.LogUtils.LOGD(org.xbmc.kore.ui.RemoteActivity.TAG, "Video is playing");
        queueMediaFile(kodiAddonUrl, connection, callbackHandler);
    }else {
        org.xbmc.kore.utils.LogUtils.LOGD(org.xbmc.kore.ui.RemoteActivity.TAG, "Nothing is playing");
        playMediaFile(kodiAddonUrl, connection, callbackHandler);
    }
}