@java.lang.Override
public void onItemSelected(android.support.v17.leanback.widget.Presenter.ViewHolder itemViewHolder, java.lang.Object item, android.support.v17.leanback.widget.RowPresenter.ViewHolder rowViewHolder, android.support.v17.leanback.widget.Row row) {
    if (itemViewHolder == null)
        return ;
    
    android.support.v17.leanback.widget.ImageCardView cardView = ((com.dummies.tasks.tv.CardPresenter.ViewHolder) (itemViewHolder)).cardView;
    android.graphics.drawable.Drawable d = cardView.getMainImage();
    if (d != null) {
        android.graphics.Bitmap b = ((android.graphics.drawable.BitmapDrawable) (d)).getBitmap();
        backgroundManager.setBitmap(b);
    }
}