public static int[] getFibonacci(int maxlength) {
    int[] myArr = new int[maxlength];
    myArr[0] = 0;
    myArr[1] = 1;
    for (int i = 2; i < maxlength; i++) {
        myArr[i] = (myArr[(i - 2)]) + (myArr[(i - 1)]);
    }
    return myArr;
}