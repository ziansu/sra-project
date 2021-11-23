public void challengeAccepted(int magicNumber, java.lang.Integer[] numbersSet) {
    java.lang.System.out.println();
    java.lang.System.out.println("Output: ");
    int[][] integers = subSetSumNumbers(magicNumber, numbersSet);
    for (int[] array : integers) {
        java.lang.System.out.println((((java.util.Arrays.toString(array)) + " = ") + (sum(array))));
    }
}