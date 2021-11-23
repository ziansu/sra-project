public void replaceDatas(java.util.List<com.liangmayong.base.widget.recycler.RecyclerListView.Item<?>> items) {
    this.items.removeAll(this.items);
    this.items.addAll(items);
    notifyDataSetChanged();
}