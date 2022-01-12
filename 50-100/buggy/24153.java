private void updateSelectionPosition() {
    int selectedPosition = ((int) (((-(mAngle)) + (((-0.5) * (java.lang.Math.signum(mAngle))) * (mItemAngle))) / (mItemAngle)));
    int currentSelectedPosition = getSelectedPosition();
    if (selectedPosition != currentSelectedPosition) {
        setSelectedPosition(selectedPosition);
    }
}