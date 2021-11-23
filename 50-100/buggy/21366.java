public static void swap(int a, int b) {
    if (a == b) {
    }else {
        java.lang.System.out.println(((("Swapping " + (Quicksort.array[a])) + " and ") + (Quicksort.array[b])));
        int temp = Quicksort.array[a];
        Quicksort.array[a] = Quicksort.array[b];
        Quicksort.array[b] = temp;
        java.lang.System.out.println(java.util.Arrays.toString(Quicksort.array));
    }
}