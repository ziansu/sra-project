public static int sumNumbersInMatrix(java.util.ArrayList<java.util.ArrayList<java.lang.Integer>> inTakeList) {
    int result = 0;
    for (int i = 0; i < (inTakeList.size()); i++) {
        java.util.ArrayList<java.lang.Integer> currentList = inTakeList.get(i);
        for (int j = 0; j < (currentList.size()); j++) {
            int number = currentList.get(j);
            result = result + number;
        }
    }
    return result;
}