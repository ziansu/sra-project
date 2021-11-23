@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView RecyclerView, int dx, int dy) {
    super.onScrolled(RecyclerView, dx, dy);
    mRecyclerViewOffset += dy;
    mRecyclerViewCardAbsolutOffset += dy;
    clipOffset();
    android.util.Log.i(ch.dominikroos.soundslasher.ShrinkScrollListener.TAG, (((((mCircledPickerHeight) + " ") + (mRecyclerViewOffset)) + " ") + (mRecyclerViewCardAbsolutOffset)));
    onMoved(computeHeight(), ((mRecyclerViewCardAbsolutOffset) - (mRecyclerViewOffset)));
}