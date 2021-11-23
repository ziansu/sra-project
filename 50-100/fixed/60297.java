public static void main(java.lang.String[] args) {
    int[] A = new int[]{ 4 , 6 , 7 , 2 , 4 , 9 , 1 , 3 };
    interview.QuickSort.quickSort(A, 0, ((A.length) - 1));
    for (int i = 0; i < (A.length); i++) {
        java.lang.System.out.print(((A[i]) + "\t"));
    }
}