@java.lang.Override
public boolean hasStableIds() {
    if ((mAdapter) != null) {
        return mAdapter.hasStableIds();
    }
    return false;
}