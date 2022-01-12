void test() {
    @MinLen(value = 5)
    int[] arr = new int[5];
    int a = 9;
    a += 4;
    a--;
    @MinLen(value = 12)
    int[] arr1 = new int[a];
    @MinLen(value = 3)
    java.lang.Integer[] arr2 = new java.lang.Integer[]{ 1 , 2 , 3 };
    @MinLen(value = 4)
    java.lang.Integer[] arr3 = new java.lang.Integer[]{ 4 , 5 , 6 };
    @MinLen(value = 7)
    int[] arr4 = new int[4];
    @MinLen(value = 16)
    int[] arr5 = new int[a];
}