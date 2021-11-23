private void saveOrRecoveryRun(int visibility) {
    if (visibility == (VISIBLE)) {
        if (mNeedRun) {
            start();
        }
    }else {
        if (mDrawable.isRunning()) {
            mNeedRun = true;
            mDrawable.stop();
        }
    }
}