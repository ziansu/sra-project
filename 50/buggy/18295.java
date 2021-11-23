public void setRightBubbleColor(int color) {
    mRightBubble.setCornerRadius(getResources().getDimensionPixelSize(R.dimen.view_radius_normal));
    mRightBubble.setColor(color);
    mMessageAdapter.setRightBubbleColor(mRightBubble);
}