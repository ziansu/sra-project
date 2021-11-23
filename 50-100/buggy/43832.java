@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    android.util.Log.d(de.mytfg.apps.mytfg.fragments.NewsDetailFragment.TAG, ("Succesfully loaded image from " + (from.name())));
    android.widget.ImageView imageView = new android.widget.ImageView(getContext());
    imageView.setImageBitmap(bitmap);
    insertView(imageView);
}