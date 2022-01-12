@java.lang.Override
public void onGet(java.lang.Object item) {
    if (checkValidCache(item)) {
        java.util.ArrayList<org.gdg.frisbee.android.api.model.Event> events = ((java.util.ArrayList<org.gdg.frisbee.android.api.model.Event>) (item));
        mAdapter.addAll(events);
        setIsLoading(false);
        android.support.design.widget.Snackbar.make(getView(), R.string.cached_content, Snackbar.LENGTH_SHORT).show();
    }else {
        modelCache.removeAsync(mCacheKey);
        onNotFound();
    }
}