public void add(T item) {
    if ((items) == null)
        return ;
    
    items.add(item);
    if (isAutoNotify)
        com.easy.adapter.EasyAdapter.notifyDataSetChanged();
    
}