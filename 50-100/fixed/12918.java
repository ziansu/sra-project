private void updateRippleSize(int width, int height) {
    final int cx = width / 2;
    final int cy = (mDual) ? (mIcon.getTop()) + (mIcon.getHeight()) : height / 2;
    final int rad = ((int) ((mIcon.getHeight()) * 1.25F));
    mRipple.setHotspotBounds((cx - rad), (cy - rad), (cx + rad), (cy + rad));
}