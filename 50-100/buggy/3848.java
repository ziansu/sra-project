public static int intArrayToOriginValue(int[] intArr) {
    int value = 0;
    int pow = (intArr.length) - 1;
    for (int i = 0; i < (intArr.length); i++) {
        java.lang.System.out.println(intArr[i]);
        value += (intArr[i]) * ((int) (java.lang.Math.pow(256, pow)));
        pow--;
    }
    return value;
}