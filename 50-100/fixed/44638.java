@android.support.annotation.Keep
public void onEventMainThread(com.jbirdvegas.mgerrit.message.Finished ev) {
    java.io.Serializable dataType = ev.getIntent().getSerializableExtra(GerritService.DATA_TYPE_KEY);
    if (dataType == (GerritService.DataType.Comment)) {
        if ((mParent) instanceof com.jbirdvegas.mgerrit.activities.ReviewActivity) {
            ((com.jbirdvegas.mgerrit.activities.ReviewActivity) (mParent)).onCommented(mCacheKey, mChangeId);
        }
    }
}