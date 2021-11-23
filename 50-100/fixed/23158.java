@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder mHolder) {
    mGameLoopThread = new com.example.balloonpop.GameLoopThread(this);
    mGameLoopThread.setRunning(true);
    mGameLoopThread.start();
    android.util.Log.d(com.example.balloonpop.GameView.TAG, ("GameView before rescale bitmap wid: " + (getWidth())));
    mBitmapBackground = android.graphics.Bitmap.createScaledBitmap(mBitmapBackground, getWidth(), getHeight(), false);
    android.util.Log.d(com.example.balloonpop.GameView.TAG, "GameView rescale bitmap");
    initGroup();
    mMessageLoopThread = new com.example.balloonpop.MessageLoopThread(this);
    mMessageLoopThread.setRunning(true);
    mMessageLoopThread.start();
}