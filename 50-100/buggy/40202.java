private static int getMaxContiguous1(java.lang.String binNumber) {
    int maxNumber = 0;
    char[] numberArray = binNumber.toCharArray();
    int count = 0;
    for (char c : numberArray) {
        if (c == '1') {
            count++;
        }else {
            if (count > maxNumber) {
                maxNumber = count;
            }
            count = 0;
        }
    }
    return maxNumber;
}