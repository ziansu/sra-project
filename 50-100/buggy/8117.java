public static void main(java.lang.String[] args) {
    int[] n = new int[]{ 100 , 101 , 22 , 1 , 56 , 5 };
    java.lang.System.out.println(java.util.Arrays.toString(n));
    HeapSort.heapsort(n);
    java.lang.System.out.println(java.util.Arrays.toString(n));
}