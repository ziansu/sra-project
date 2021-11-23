@hugo.weaving.DebugLog
@java.lang.Override
public java.lang.Object getItem(int position) {
    return ((mPlay) == null) || ((mPlay.getPlayerCount()) < position) ? null : mPlay.getPlayers().get(position);
}