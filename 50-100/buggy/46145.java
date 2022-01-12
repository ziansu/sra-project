public static void selectionSort(int[] array) {
    for (int top = (array.length) - 1; top > 0; top--) {
        int positionOfMax = 0;
        for (int i = 1; i <= top; i++) {
            if ((array[1]) > (array[positionOfMax]))
                positionOfMax = i;
            
        }
        int temp = array[top];
        array[top] = array[positionOfMax];
        array[positionOfMax] = temp;
    }
}