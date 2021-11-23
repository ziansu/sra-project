private void setActivatedPosition(int position) {
    if (position == (android.widget.ListView.INVALID_POSITION)) {
        getListView().setItemChecked(mActivatedPosition, false);
        if ((mAdapter) != null) {
            mAdapter.setSelected(mActivatedPosition);
            mAdapter.notifyDataSetChanged();
        }
    }else {
        getListView().setItemChecked(position, true);
        if ((mAdapter) != null) {
            mAdapter.setSelected(position);
            mAdapter.notifyDataSetChanged();
        }
    }
    mActivatedPosition = position;
}