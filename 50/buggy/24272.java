@java.lang.Override
public void resume() {
    mContext.startService(com.reissgrvs.spotifyplaylisttool.Player.PlayerService.getIntent(mContext));
}