public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < (arr.length); i++) {
        int a = arr[i];
        int j = i;
        while ((j > 0) && ((arr[(j - 1)]) > a))
            arr[j] = arr[(--j)];
        
        arr[j] = a;
    }
    return arr;
}