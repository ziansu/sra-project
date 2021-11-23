public void addHeaderView(android.view.View header) {
    if (header == null) {
        throw new java.lang.RuntimeException("header is null");
    }
    this.mHeaderView = header;
    this.notifyDataSetChanged();
}