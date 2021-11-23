public void add(int position, T item) {
    if ((items) == null)
        return ;
    
    items.add(position, item);
    if (isAutoNotify)
        com.easy.adapter.EasyAdapter.notifyDataSetChanged();
    
}