private void selectHeader(int index) {
    boolean isTabletLayout = getArguments().getBoolean(com.qiaoqiao.settings.SettingHeadersFragment.EXTRAS_TABLET_LAYOUT);
    if (isTabletLayout) {
        android.support.v7.widget.RecyclerView listView = getListView();
        if (listView != null) {
            if ((mSelectedItem) != null) {
                mSelectedItem.setBackgroundColor(mUnselectedItemColor);
            }
            if ((listView.findViewHolderForAdapterPosition(index)) == null) {
                return ;
            }
            mSelectedItem = listView.findViewHolderForAdapterPosition(index).itemView;
            mSelectedItem.setBackgroundColor(mSelectedItemColor);
        }
    }
}