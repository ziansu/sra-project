@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    java.lang.String errMsg = "VideoView:onError";
    android.util.Log.e(com.kaltura.playersdk.players.KWVCPlayer.TAG, errMsg);
    mListener.eventWithValue(this, KPlayerListener.ErrorKey, ((((((((com.kaltura.playersdk.players.KWVCPlayer.TAG) + "-") + errMsg) + "(") + what) + ",") + extra) + ")"));
    return true;
}