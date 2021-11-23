@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(mContext, io.tanners.taggedwallpaper.DisplayActivity.class);
    intent.putExtra(DisplayActivity.ARTIST, mCurrentItem.getUser());
    intent.putExtra(DisplayActivity.FULLIMAGE, mCurrentItem.getImageURL());
    intent.putExtra(DisplayActivity.PREVIEW, mCurrentItem.getLargeImageURL());
    android.util.Log.i("DISPLAY", ("DEBUG: " + (mCurrentItem.getLargeImageURL())));
    mContext.startActivity(intent);
}