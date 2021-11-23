@java.lang.Override
public void destroyItem(android.view.ViewGroup container, int position, java.lang.Object object) {
    container.removeView(((android.widget.RelativeLayout) (object)));
    com.squareup.picasso.Picasso.with(mMeFullScreenActivity).cancelRequest(mImageView);
}