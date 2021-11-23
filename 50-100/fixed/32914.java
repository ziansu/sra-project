public static void main(java.lang.String[] args) {
    int[] test1 = new int[]{ 2 , 5 , -2 , 6 , -3 , 8 , 0 , -7 , -9 , 4 , 0 , -3 , -5 };
    Quick.quickSort(test1);
    for (int i = 0; i < (test1.length); i++) {
        java.lang.System.out.print(((test1[i]) + ","));
    }
}