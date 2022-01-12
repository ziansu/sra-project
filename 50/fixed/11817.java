@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    if ((mRecyclerView) != null) {
        return mRecyclerView.getLayoutManager().onSaveInstanceState();
    }
    return super.onSaveInstanceState();
}