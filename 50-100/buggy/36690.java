private void updateTextViewScore() {
    mTextViewScore.setText(java.lang.Integer.toString(getScore()));
    if ((getScore()) == 1) {
        if ((mGameLevels.levelToPlay) <= (mGameLevels.getHighestLevelCrossed(mContext))) {
            mGameLevels.updateLevelStatus(mContext);
        }
        mTextViewScore.setText(((java.lang.Integer.toString(getScore())) + " YOU WIN"));
        alertProceedToNextLevel(R.string.next_level, R.string.continue_playing);
    }
}