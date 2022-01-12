@java.lang.Override
public android.view.View instantiateItem(android.view.ViewGroup container, int position) {
    uk.co.senab.photoview.PhotoView photoView = new uk.co.senab.photoview.PhotoView(container.getContext());
    java.lang.String url = mResizer.getUrlForScreen(mUrls[position]);
    container.setBackgroundColor(Color.BLACK);
    com.bumptech.glide.Glide.with(this).load(url).into(photoView);
    container.addView(photoView, LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    photoView.setTag(mUrls[position]);
    return photoView;
}