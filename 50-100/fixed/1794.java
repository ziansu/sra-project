@android.support.annotation.Keep
public void onEventMainThread(com.jbirdvegas.mgerrit.message.Finished ev) {
    android.content.Intent intent = ev.getIntent();
    java.io.Serializable dataType = intent.getSerializableExtra(GerritService.DATA_TYPE_KEY);
    if (dataType == (GerritService.DataType.Comment)) {
        com.jbirdvegas.mgerrit.objects.CacheManager.remove(mCacheCommentKey, true);
        java.lang.String message = getResources().getString(R.string.review_sent_message, mSelectedChange);
        android.widget.Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}