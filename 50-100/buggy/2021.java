private void addDrawActions(boolean isNeedPaint) {
    if (isNeedPaint) {
        cleanRedoTask();
    }
    if (((mDrawActions) != null) && ((mCurAction) != null)) {
        mDrawActions.add(mCurAction);
        (count)++;
    }
}