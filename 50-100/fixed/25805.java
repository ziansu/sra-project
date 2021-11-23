private float getProgressForAngle(double angle) {
    float touchProgress = ((float) ((valuePerDegree()) * angle));
    touchProgress = (touchProgress < 0) ? com.triggertrap.seekarc.SeekArc.INVALID_PROGRESS_VALUE : touchProgress;
    touchProgress = (touchProgress > (mMax)) ? com.triggertrap.seekarc.SeekArc.INVALID_PROGRESS_VALUE : touchProgress;
    return touchProgress;
}