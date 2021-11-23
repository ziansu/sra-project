public void add(int position, java.util.List<? extends T> items) {
    if ((this.items) == null)
        return ;
    
    this.items.addAll(position, items);
    if (isAutoNotify)
        com.easy.adapter.EasyAdapter.notifyDataSetChanged();
    
}