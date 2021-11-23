public void setSelection(boolean flag) {
    mIsSelected = flag;
    if (flag && ((mAnimTimer) == null)) {
        mAnimTimer = new com.tencent.jinjingcao.section_progress.SectionProgressBar.AnimationTimer();
        mAnimTimer.start();
    }else
        if ((!flag) && ((mAnimTimer) != null)) {
            mAnimTimer.stop();
        }
    
}