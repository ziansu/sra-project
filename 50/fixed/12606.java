@java.lang.Override
public int getItemCount() {
    if ((mAdapter) != null) {
        return (mAdapter.getItemCount()) == 0 ? 0 : (getFootersCount()) + (mAdapter.getItemCount());
    }else {
        return 0;
    }
}