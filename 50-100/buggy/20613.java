private void addNextCard() {
    if ((nextAdapterCard) < (mAdapter.getCount())) {
        android.view.View newBottomChild = mAdapter.getView(nextAdapterCard, null, this);
        if ((hardwareAccelerationEnabled) == true) {
            newBottomChild.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        }
        this.lastRemovedView = null;
        newBottomChild.setY(paddingTop);
        addAndMeasureChild(newBottomChild);
        (nextAdapterCard)++;
    }
    setupTopCard();
}