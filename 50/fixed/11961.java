@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    container.removeView(((android.view.View) (object)));
    com.squareup.picasso.Picasso.with(mMeFullScreenActivity).cancelRequest(mImageView);
}