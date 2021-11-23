@hugo.weaving.DebugLog
@java.lang.Override
public java.lang.Object getItem(int position) {
    return ((mPlay) == null) || (position < (mPlay.getPlayerCount())) ? null : mPlay.getPlayers().get(position);
}