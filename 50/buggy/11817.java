@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    super.onSaveInstanceState();
    if ((mRecyclerView) != null) {
        return mRecyclerView.getLayoutManager().onSaveInstanceState();
    }
    return null;
}