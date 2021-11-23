@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mDetailListView.setItemChecked(position, true);
    position = position - (mDetailListView.getHeaderViewsCount());
    if (position >= (mDetailAdapter.getCount())) {
        return false;
    }
    net.jejer.hipda.ui.ThreadDetailActionModeCallback cb = new net.jejer.hipda.ui.ThreadDetailActionModeCallback(this, mFid, mTid, mDetailAdapter.getItem(position));
    ((android.support.v7.app.AppCompatActivity) (getActivity())).startSupportActionMode(cb);
    return true;
}