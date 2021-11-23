public java.util.ArrayList<java.lang.Integer> bubbleSort() {
    for (int i = (arrayList.size()) - 1; i > 1;) {
        for (int j = 0; j < i; j++) {
            if ((arrayList.get(j)) > (arrayList.get((j + 1)))) {
                swapValues(j, (j + 1));
            }
        }
    }
    return theArray;
}