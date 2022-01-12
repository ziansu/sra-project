@org.junit.Test
public void testInsertionSort() {
    int[] arr = new int[]{ 4 , 2 , 5 , 1 , 0 , 9 , 123 };
    com.naptex.study.dsa.sort.MergeSort sorter = new com.naptex.study.dsa.sort.MergeSort();
    sorter.insertionSort(arr, 0, ((arr.length) - 1));
    int[] sortedArr = new int[]{ 0 , 1 , 2 , 4 , 5 , 9 , 123 };
    org.junit.Assert.assertTrue(java.util.Arrays.equals(arr, sortedArr));
}