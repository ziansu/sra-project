private void addNextCard() {
    if ((nextAdapterCard) < (mAdapter.getCount())) {
        android.view.View newBottomChild = mAdapter.getView(nextAdapterCard, null, this);
        this.lastRemovedView = null;
        newBottomChild.setY(paddingTop);
        addAndMeasureChild(newBottomChild);
        (nextAdapterCard)++;
    }
    setupTopCard();
}