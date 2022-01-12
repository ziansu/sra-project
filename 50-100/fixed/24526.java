public void stop() {
    if (!(bInService)) {
        return ;
    }
    bInService = false;
    mBuffer.clear();
    for (com.androidlogsuite.service.FileReadWorker worker : mFileReadWorkers.values()) {
        worker.stop();
    }
    mFileReadWorkers.clear();
    try {
        com.androidlogsuite.service.FileReadService.mServerSocketChannel.close();
        com.androidlogsuite.service.FileReadService.mSelector.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    com.androidlogsuite.util.Log.d(com.androidlogsuite.service.FileReadService.TAG, "Mission done. FileReadService is stopped.");
}