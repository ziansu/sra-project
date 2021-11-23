public int update(java.util.List<T> newData) {
    if ((newData.size()) == 0) {
        return -1;
    }
    data.addAll(newData);
    update(true);
    return data.size();
}