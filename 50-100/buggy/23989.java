private void restoreInstanceState(android.os.Bundle savedInstanceState) {
    com.jparkie.givesmehope.models.Story.getParcelable(savedInstanceState, mVoteStory);
    if ((mVoteStory) != null) {
        mVoteView.setVoteImageView(mVoteStory.getImageUrl());
        mVoteView.setVoteFooterTextView(mVoteStory.getFooter());
        mVoteView.showVoteCardView();
    }
}