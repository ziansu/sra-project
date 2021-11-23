private synchronized void insert2Db() {
    gps.fhv.at.gps_hawk.workers.MotionWorker.mIsThreadWorking = true;
    if ((mCurrentMV) > 0) {
        mTaskSave2Db = getTaskSave2Db();
        mTaskSave2Db.execute(mCurrentMV);
    }
}