@java.lang.Override
public void onComplete() {
    saveData(IEntity.STATE_COMPLETE, entity.getFileSize());
    (mCompleteNum)++;
    handleSpeed(0);
    mListener.onSubComplete(entity);
    if ((mCompleteNum) >= (mTaskEntity.getEntity().getSubTask().size())) {
        closeTimer(false);
        mListener.onComplete();
    }
    if (((mCompleteNum) + (mFailNum)) >= (mActualTaskNum)) {
        closeTimer(false);
        mListener.onComplete();
    }
}