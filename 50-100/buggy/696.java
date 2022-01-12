public static void main(java.lang.String[] args) {
    int[] data = new int[]{ 20 , 15 , 12 , 30 , -5 , 72 , 34 , 9 , 456 , 999 };
    java.lang.System.out.println("Before Sort");
    com.bporamin.Common.show(data);
    java.lang.System.out.println("After Sort");
    com.bporamin.Common.show(com.bporamin.sort.SelectionSort.selectionSort(data));
}