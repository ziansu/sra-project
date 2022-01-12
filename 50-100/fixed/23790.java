public static void main(java.lang.String[] args) {
    int[] arr = new int[]{ 0 , 2 , 5 , 6 , 8 , 20 };
    int a = basic_algo.BinarySearch.binarySearch(arr, 0);
    int b = basic_algo.BinarySearch.binarySearchRec(arr, 5);
    java.lang.System.out.println(((a + ", ") + b));
}