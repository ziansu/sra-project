private void CleanFrom(java.util.List<java.lang.Integer> indexMap, int cnt) {
    for (int index : indexMap) {
        if ((index >= (indexMap.get(cnt))) && ((layout[(index / 9)][(index % 9)]) != 0)) {
            layout[(index / 9)][(index % 9)] = 0;
        }
    }
}