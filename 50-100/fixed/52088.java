@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    selectedPos = position;
    com.qiyu.wbg.cascadeview.CascadeData selectData = mDataSource.get(position);
    if ((mCallback) != null) {
        mTitle = selectData.name;
        mCallback.onChoose(mLevel, position, selectData.name, selectData.children);
    }
    mContentAdapter.notifyDataSetChanged();
}