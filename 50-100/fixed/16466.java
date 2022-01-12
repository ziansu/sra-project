public static void main(java.lang.String[] args) {
    int[] a = new int[]{ -5 };
    int len = a.length;
    java.lang.System.out.println(BinarySearch.binSearch(a, java.lang.Integer.parseInt(args[0]), 0, len));
}