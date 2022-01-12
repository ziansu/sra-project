public void add(int position, T item) {
    if ((items) == null)
        items = new java.util.ArrayList<>();
    
    items.add(position, item);
    if (isAutoNotify)
        com.easy.adapter.EasyAdapter.notifyDataSetChanged();
    
}