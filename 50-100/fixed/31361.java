public int sizeById(T key) {
    if (!(list.containsKey(key))) {
        return 0;
    }
    if (((list.get(key)) == null) || ((list.get(key).size()) == 0)) {
        list.remove(key);
        return 0;
    }
    return list.get(key).size();
}