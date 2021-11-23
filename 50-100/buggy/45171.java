public static void main(java.lang.String[] args) {
    java.lang.System.out.printf("%10s====A====%n", "");
    int[] a = new int[]{ 1 , 0 , 3 , 2 , 3 , 4 , 2 , 3 };
    Quick.printArr(a);
    Quick.printArr("Returned %a", Quick.partition(a, 0, ((a.length) - 1), 3));
    Quick.printArr(a);
}