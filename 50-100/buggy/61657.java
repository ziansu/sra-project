@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if ((mFeedItem) != null) {
        int resource = getResources().getIdentifier(("content_card_x_0" + (mFeedItem.getId())), "drawable", getContext().getPackageName());
        loadPicture(resource);
        id.setText(mFeedItem.toString());
    }
}