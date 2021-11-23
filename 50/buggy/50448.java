@java.lang.Override
public boolean canChildScrollUp() {
    if ((android.os.Build.VERSION.SDK_INT) < 14) {
        return (mRecyclerView.getScrollY()) > 0;
    }else {
        return android.support.v4.view.ViewCompat.canScrollVertically(mRecyclerView, (-1));
    }
}