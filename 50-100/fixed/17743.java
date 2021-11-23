@java.lang.Override
public void setRating(float rating) {
    if (rating > (mNumStars)) {
        rating = mNumStars;
    }
    if (rating < 0) {
        rating = 0;
    }
    if ((mRating) == rating) {
        return ;
    }
    mRating = rating;
    if ((mOnRatingChangeListener) != null) {
        mOnRatingChangeListener.onRatingChange(this, mRating);
    }
    fillRatingBar(rating);
}