@java.lang.Override
public android.view.View instantiateItem(android.view.ViewGroup container, int position) {
    container.setBackgroundColor(Color.BLACK);
    uk.co.senab.photoview.PhotoView photoView = new uk.co.senab.photoview.PhotoView(container.getContext());
    com.bumptech.glide.Glide.with(this).load(mResizer.getUrlForScreen(mUrls[position])).into(photoView);
    container.addView(photoView, LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    photoView.setTag(mUrls[position]);
    return photoView;
}