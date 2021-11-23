public static void main(java.lang.String[] args) {
    int[] input = new int[]{ 5 , 4 , 3 , 2 , 1 , 0 };
    int[] sortedArray = new int[input.length];
    linearTimeSort.CountingSort.countingSort(input, sortedArray, 6);
    java.lang.System.out.println(java.util.Arrays.toString(sortedArray));
}