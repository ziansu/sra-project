public static void main(java.lang.String[] args) {
    int[] myArray = new int[]{ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
    java.lang.System.out.println(algo.binarysearch.BinarySearch.search(myArray, 7));
    java.lang.System.out.println(algo.binarysearch.BinarySearch.recursiveSearch(myArray, 7, 0, ((myArray.length) - 1)));
}