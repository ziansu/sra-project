public boolean remove(int val) {
    if (map.containsKey(val)) {
        helperMap.remove(map.get(val));
        map.remove(val);
        (counter)++;
        return true;
    }else {
        return false;
    }
}