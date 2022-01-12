@java.lang.Override
public boolean onPreDraw() {
    imageView.setVisibility(View.VISIBLE);
    if ((!(isDetached())) && ((getActivity()) != null)) {
        try {
            glide(rssItem.imageurl).centerCrop().into(imageView);
        } catch (java.lang.IllegalArgumentException e) {
            android.util.Log.d(com.nononsenseapps.feeder.ui.FeedFragment.TAG, e.getLocalizedMessage());
        }
    }
    itemView.getViewTreeObserver().removeOnPreDrawListener(this);
    return true;
}