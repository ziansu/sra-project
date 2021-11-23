private synchronized boolean addItem(int id, server.ReservableItem item) {
    boolean doesExist = false;
    java.lang.String key = item.getKey();
    java.lang.System.out.println(((("Adding item for id : " + id) + " and item key : ") + key));
    if (storage.containsKey(key)) {
        updateStorage(item, key);
        doesExist = true;
    }else {
        storage.put(key, item);
    }
    return doesExist;
}