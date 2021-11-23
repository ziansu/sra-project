@java.lang.Override
public T forId(java.lang.Long id) {
    T item = this.itemByPrimaryKey.get(id);
    if (item != null) {
        onPreRead();
        return detach(item);
    }else {
        item = filterChain().filter("id", id).first();
        if (item != null) {
            loadItem(item);
        }
        return item;
    }
}