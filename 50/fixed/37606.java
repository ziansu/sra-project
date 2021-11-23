public void addFooterView(android.view.View footer) {
    mNextLoadEnable = false;
    this.mFooterView = footer;
    this.notifyDataSetChanged();
}