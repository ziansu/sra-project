private void saveOrRecoveryRun(int visibility) {
    if ((mDrawable) == null) {
        return ;
    }
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