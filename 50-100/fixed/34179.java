private static android.widget.ImageView AddImageView(android.app.Activity activity, int imgResId, int x, int y) {
    android.widget.ImageView imageView = new android.widget.ImageView(activity);
    imageView.setImageResource(imgResId);
    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity);
    frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT));
    frameLayout.addView(imageView);
    activity.addContentView(frameLayout, new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    frameLayout.setX(x);
    frameLayout.setY(y);
    return imageView;
}