@java.lang.Override
public boolean startStreaming(me.lake.librestreaming.rtmp.RESFlvDataCollecter flvDataCollecter) {
    synchronized(syncOp) {
        videoGLHander.sendMessage(videoGLHander.obtainMessage(me.lake.librestreaming.core.RESHardVideoCore.VideoGLHandler.WHAT_START_STREAMING, flvDataCollecter));
        synchronized(syncIsLooping) {
            if ((!(isPreviewing)) && (!(isStreaming))) {
                videoGLHander.removeMessages(me.lake.librestreaming.core.RESHardVideoCore.VideoGLHandler.WHAT_DRAW);
                videoGLHander.sendMessageDelayed(videoGLHander.obtainMessage(me.lake.librestreaming.core.RESHardVideoCore.VideoGLHandler.WHAT_DRAW, ((android.os.SystemClock.uptimeMillis()) + (loopingInterval))), loopingInterval);
            }
            isStreaming = true;
        }
    }
    return true;
}