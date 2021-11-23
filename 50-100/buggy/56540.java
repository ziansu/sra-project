public void put(K key, V val) {
    if ((list) != null) {
        lab9.ULLMap<K, V>.Entry lookup = list.get(key);
        if (lookup == null) {
            list = new Entry(key, val, list);
        }else {
            lookup.val = val;
        }
    }else {
        list = new Entry(key, val, list);
        size = (size) + 1;
    }
}