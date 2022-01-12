@java.lang.Override
public void onDrawFrame(javax.microedition.khronos.opengles.GL10 unused) {
    if (GameActivity.DEBUGGING) {
        if ((game.getTime()) > 1.0F) {
            return ;
        }
    }
    long now = java.lang.System.currentTimeMillis();
    if ((now - (mLastTime)) < (1000.0 / (com.example.dennis.leagueoflegions.view.GameRenderer.FPS))) {
        return ;
    }
    tick();
    draw();
    mLastTime = now;
}