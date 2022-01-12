public void finalizeAnimation() {
    if (mBlocking) {
        mStickman.mAnimationScheduler.proceed(this);
    }else {
        mStickman.mAnimationScheduler.removeAnimation(this);
    }
    if ((mStickman.getStickmanStageController()) != null) {
        if (!(mStickman.getStickmanStageController().ismNetwork())) {
            mStickman.notifyListeners(mID);
        }else {
            mStickman.getStickmanStageController().sendAnimationUpdate("end", getmID());
        }
    }
}