@java.lang.Override
public void run() {
    setupMenuItems();
    ((android.widget.BaseAdapter) (mDrawerList.getAdapter())).notifyDataSetChanged();
}