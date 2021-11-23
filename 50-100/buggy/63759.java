@java.lang.Override
public void onClick(com.example.xyzreader.ui.ArticleListAdapter.ViewHolder viewHolder) {
    final android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_VIEW, ItemsContract.Items.buildItemUri(adapter.getItemId(viewHolder.getAdapterPosition())));
    android.support.v4.app.ActivityOptionsCompat activityOptions = null;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        activityOptions = android.support.v4.app.ActivityOptionsCompat.makeSceneTransitionAnimation(this, viewHolder.thumbnailView, viewHolder.thumbnailView.getTransitionName());
    }
    startActivity(intent, (activityOptions != null ? activityOptions.toBundle() : null));
}