@java.lang.Override
public void run() {
    setDropDownRefreshState(false);
    mAdapter.showFootItem();
    mAdapter.setFootViewSuccess();
    mAdapter.notifyDataSetChanged();
}