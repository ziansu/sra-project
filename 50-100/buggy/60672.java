@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    if ((-1) == (playPort)) {
        return ;
    }
    android.view.Surface surface = holder.getSurface();
    if ((null != (hikvisionPlayer)) && (true == (surface.isValid()))) {
        if (false == (hikvisionPlayer.setVideoWindow(playPort, 0, holder))) {
            android.util.Log.e(TAG, "Player setVideoWindow failed!");
        }
    }
}