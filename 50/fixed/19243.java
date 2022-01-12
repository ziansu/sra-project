public void populateItem(com.github.stakkato95.sprint3.model.local.Post post) {
    mTitle.setText(post.mTitle);
    mText.setText(post.mText);
    mRating.setText(java.lang.Integer.toString(post.mRating));
    mExternal.setText(post.mExternal);
}