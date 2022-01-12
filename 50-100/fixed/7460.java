private int getProgressForAngle(double angle) {
    int touchProgress = ((int) (java.lang.Math.round(((valuePerDegree()) * angle))));
    if (mDragging) {
        touchProgress = (touchProgress < 0) ? com.triggertrap.seekarc.SeekArc.INVALID_PROGRESS_VALUE : touchProgress;
        touchProgress = (touchProgress > (mMax)) ? com.triggertrap.seekarc.SeekArc.INVALID_PROGRESS_VALUE : touchProgress;
        return touchProgress;
    }else
        return -1;
    
}