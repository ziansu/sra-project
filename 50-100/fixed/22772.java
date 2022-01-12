@java.lang.Override
public void onItemClick(android.view.View view, com.seroal.rssreader.view.FeedViewHolder feedViewHolder) {
    if (feedViewHolder != null)
        if ((feedViewHolder.image.getDrawable()) != null) {
            android.graphics.drawable.BitmapDrawable drawable = ((android.graphics.drawable.BitmapDrawable) (feedViewHolder.image.getDrawable()));
            android.graphics.Bitmap bitmap = drawable.getBitmap();
            com.seroal.rssreader.utils.StorageManager.storeImage(bitmap);
            android.widget.Toast.makeText(getApplicationContext(), "Saved!", Toast.LENGTH_LONG).show();
        }
    
}