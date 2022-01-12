private void addNextCard() {
    if ((nextAdapterCard) < (mAdapter.getCount())) {
        android.view.View newBottomChild = mAdapter.getView(nextAdapterCard, null, this);
        if (hardwareAccelerationEnabled) {
            newBottomChild.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        }
        addAndMeasureChild(newBottomChild);
        (nextAdapterCard)++;
    }
    setupTopCard();
}