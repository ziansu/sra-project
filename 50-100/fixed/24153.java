private void updateSelectionPosition() {
    int position = ((int) (((-(mAngle)) + (((-0.5) * (java.lang.Math.signum(mAngle))) * (mItemAngle))) / (mItemAngle)));
    setSelectedPosition(position);
}