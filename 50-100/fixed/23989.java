private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    mVoteStory = com.jparkie.givesmehope.models.Story.getParcelable(savedInstanceState);
    if ((mVoteStory) != null) {
        mVoteView.setVoteImageView(mVoteStory.getImageUrl());
        mVoteView.setVoteFooterTextView(mVoteStory.getFooter());
        mVoteView.showVoteCardView();
    }
}