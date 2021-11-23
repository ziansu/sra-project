@java.lang.Override
public void addReview(final io.angelhack.verd.firebase.FBReview review) {
    if ((review.getImageUri()) != null) {
        writeImageThenReview(review);
    }else {
        writeReview(review);
    }
}