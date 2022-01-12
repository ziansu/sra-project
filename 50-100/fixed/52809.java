@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
public void onMapSharedElements(java.util.List<java.lang.String> names, java.util.Map<java.lang.String, android.view.View> sharedElements) {
    if ((mIsReturning) && ((names.size()) > 0)) {
        android.view.View v = mRecyclerView.findViewWithTag(names.get(0));
        if (v != null) {
            sharedElements.clear();
            sharedElements.put(names.get(0), v);
        }
    }
}