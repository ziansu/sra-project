public int findMin(java.util.List<java.lang.Integer> needToSearch) {
    int tempMin = needToSearch.get(0);
    int index = 0;
    for (int i = 0; i < (needToSearch.size()); i++) {
        if ((needToSearch.get(i)) < tempMin) {
            tempMin = needToSearch.get(i);
            index = i;
        }
    }
    return index;
}