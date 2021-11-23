public boolean insert(int val) {
    if (valueMap.containsKey(val)) {
        return false;
    }
    (count)++;
    valueMap.put(val, count);
    randomMap.put(count, val);
    return true;
}