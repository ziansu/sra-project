private void CleanFrom(java.util.List<java.lang.Integer> indexMap, int cnt) {
    for (int index = indexMap.get(cnt); index != 81; index = indexMap.get((++cnt))) {
        if ((layout[(index / 9)][(index % 9)]) != 0) {
            layout[(index / 9)][(index % 9)] = 0;
        }
    }
}