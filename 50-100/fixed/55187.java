public static void main(java.lang.String[] args) {
    int[] a = new int[]{ 5 , 3 , 6 , 4 , 8 , 3 , 6 , 3 , 7 , 22 , 5 , 3 };
    edu.evansdaniel.collections.SortingUtils.qs(a, 0, ((a.length) - 1));
    for (int i = 0; i < (a.length); i++) {
        java.lang.System.out.print(((a[i]) + "   "));
    }
}