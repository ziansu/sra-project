private boolean testInsertionAscending(int[] data) {
    int[] sortedData = Insertion.ascending(data);
    int[] check = new int[]{ 1 , 2 , 3 , 4 , 5 };
    for (int i = 0; i < (data.length); i++) {
        if ((sortedData[i]) != (check[i])) {
            return false;
        }
    }
    return true;
}