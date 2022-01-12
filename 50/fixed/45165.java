public void stepSet(int step) {
    if ((step > 0) && (step <= (mStepCount))) {
        mStepCurrent = step;
        updateLayouts();
    }
}