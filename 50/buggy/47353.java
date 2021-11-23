@java.lang.Override
public void onBitmapLoaded(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    account.setPhoto(bitmap.copy(Bitmap.Config.ARGB_8888, true));
    notifyAccountDataChanged();
}