private void startCellActivatedAnimation(com.zappyware.learnletters.entities.Point point) {
    final com.zappyware.learnletters.ui.LetterView.CellState cellState = mPointStates.get(point);
    startSizeAnimation(mDotSize, mDotSizeActivated, 96, mLinearOutSlowInInterpolator, cellState, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startSizeAnimation(mDotSizeActivated, mDotSize, 192, mFastOutSlowInInterpolator, cellState, null);
        }
    });
    startLineEndAnimation(cellState, mInProgressX, mInProgressY, getCenterXForColumn(point.y), getCenterYForRow(point.x));
}