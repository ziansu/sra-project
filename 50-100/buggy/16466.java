public static void main(java.lang.String[] args) {
    int[] a = new int[]{ 1 , 3 , 5 , 6 , 7 , 10 , 11 , 15 };
    int len = a.length;
    java.lang.System.out.println(BinarySearch.binSearch(a, java.lang.Integer.parseInt(args[0]), 0, len));
}