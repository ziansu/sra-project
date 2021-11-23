public java.lang.Long get(java.lang.Integer key) {
    java.lang.Long result = null;
    for (int position = positionByKey(key); ; position++) {
        position = (position > (entries.length)) ? 0 : position;
        ua.bolt.HashMap.Entry entry = entries[position];
        if (entry == null)
            break;
        
        if (entry.key.equals(key)) {
            result = entry.val;
            break;
        }
    }
    return result;
}