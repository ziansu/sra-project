private static int calculate() {
    int answer = 0;
    java.lang.String[] inputArray = RNC.stack1.toArray(new java.lang.String[0]);
    java.lang.System.out.print("\nThe Roman Numeral you entered to calculate is: ");
    for (int i = (inputArray.length) - 1; i >= 0; i--) {
        java.lang.System.out.print(inputArray[i]);
    }
    java.lang.System.out.println();
    return answer;
}