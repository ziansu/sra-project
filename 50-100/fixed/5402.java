private void delete(com.example.dmytro.mapalert.pojo.CursorLocation item) {
    dataSource.deleteLocation(item.getId(), item.getItem().getImagePath(), item.getItem());
    int position = items.indexOf(item);
    items.remove(position);
    notifyItemRemoved(position);
    if (mAddButton.hasShadow())
        mAddButton.show();
    
}