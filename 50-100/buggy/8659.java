@java.lang.Override
public boolean onError(io.vov.vitamio.MediaPlayer mp, int what, int extra) {
    android.util.Log.e(com.xugaoxiang.live_vtm.activity.MainActivity.TAG, (((("播放出错！" + "what:") + what) + ",extra:") + extra));
    android.widget.Toast.makeText(this, ((("播放出错！what:" + what) + ",extra:") + extra), Toast.LENGTH_LONG).show();
    finish();
    return false;
}