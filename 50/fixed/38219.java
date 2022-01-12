@java.lang.Override
public void onBitmapFailed(android.graphics.drawable.Drawable errorDrawable) {
    android.util.Log.e(de.mytfg.apps.mytfg.fragments.NewsDetailFragment.TAG, "Error while downloading image");
    android.widget.ImageView imageView = new android.widget.ImageView(context);
    imageView.setImageDrawable(errorDrawable);
    insertView(imageView);
}