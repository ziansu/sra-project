public int sizeById(T key) {
    if ((!(list.containsKey(key))) || ((list.get(key)) == null)) {
        return 0;
    }
    return list.get(key).size();
}