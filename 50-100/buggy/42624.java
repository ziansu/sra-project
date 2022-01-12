public static void main(java.lang.String[] args) {
    int[] array = new int[]{ 7 , 2 , 13 , 9 , 26 , 22 , 1 , 4 , 3 , 5 , 11 , 8 , 2 };
    QuickSortDemo.quicksort(array);
    for (int i = 0; i < (array.length); i++)
        java.lang.System.out.print(((array[i]) + " "));
    
}