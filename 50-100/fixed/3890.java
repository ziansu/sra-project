public int maxSubArray(int[] arrayElements) {
    int finalMaxSum = 0;
    int currentMaxSum = 0;
    for (int i = 0; i < (arrayElements.length); i++) {
        currentMaxSum = currentMaxSum + (arrayElements[i]);
        if ((i == 0) | (currentMaxSum > finalMaxSum)) {
            finalMaxSum = currentMaxSum;
        }
        if (currentMaxSum < 0) {
            currentMaxSum = 0;
        }
    }
    java.lang.System.out.println(("Maximum sum of Sub Array" + finalMaxSum));
    return 0;
}