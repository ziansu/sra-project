@java.lang.Override
public void handleMessage(@android.support.annotation.NonNull
android.os.Message message) {
    switch (message.what) {
        case com.j.jface.face.DigitalWatchFaceService.Engine.MSG_UPDATE_TIME :
            invalidate();
            final long nextUpdateTime = nextUpdateTime();
            final long now = java.lang.System.currentTimeMillis();
            android.util.Log.e("[32mNEXT UPDATE[0m", ((("" + nextUpdateTime) + " : ") + (nextUpdateTime - now)));
            mUpdateTimeHandler.sendEmptyMessageDelayed(com.j.jface.face.DigitalWatchFaceService.Engine.MSG_UPDATE_TIME, (nextUpdateTime - now));
            break;
    }
}