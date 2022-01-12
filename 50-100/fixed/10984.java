private void notifyRendering() {
    if ((drawTask) != null) {
        drawTask.requestClear();
    }
    if (mUpdateInNewThread) {
        synchronized(this) {
            mDrawTimes.clear();
        }
        synchronized(drawTask) {
            drawTask.notifyAll();
        }
    }else {
        mDrawTimes.clear();
        removeMessages(master.flame.danmaku.controller.DrawHandler.UPDATE);
        sendEmptyMessage(master.flame.danmaku.controller.DrawHandler.UPDATE);
    }
    mRenderingState.inWaitingState = false;
}