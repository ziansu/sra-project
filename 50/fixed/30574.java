@java.lang.Override
public void onClick(android.view.View v) {
    if ((mOnItemClickListener) != null) {
        mOnItemClickListener.onItemClick(v, mDataList.get(position), position);
    }
}