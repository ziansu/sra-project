@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    clipToolbarOffset();
    onMoved(mToolbarOffset);
    if ((((mToolbarOffset) < (mToolbarHeight)) && (dy > 0)) || (((mToolbarOffset) > 0) && (dy < 0))) {
        mToolbarOffset += dy;
    }
    mTotalScrolledDistance += dy;
}