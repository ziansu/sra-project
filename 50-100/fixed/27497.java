public static int[] getFibonacci(int maxlength) {
    int[] myArr = new int[maxlength];
    for (int i = 0; i < maxlength; i++) {
        if (i >= 2)
            myArr[i] = (myArr[(i - 2)]) + (myArr[(i - 1)]);
        else
            myArr[i] = i;
        
    }
    return myArr;
}