public static void tellRightOrWrong() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("What is 12 + 12?");
    int rightOrWrongInput = scanner.nextInt();
    boolean rightOrWrongAnswer;
    if (rightOrWrongInput == 24) {
        rightOrWrongAnswer = true;
    }else {
        rightOrWrongAnswer = false;
    }
    java.lang.System.out.println(rightOrWrongAnswer);
    java.lang.System.out.println("");
    scanner.close();
}