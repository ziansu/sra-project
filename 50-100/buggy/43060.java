private void computeAgain() {
    java.util.Scanner answer = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("\r\nDo you want to compute again? (y/n)");
    char myAnswer = answer.next().toLowerCase().charAt(0);
    if (myAnswer == 'y') {
        turnOn();
    }else {
        java.lang.System.out.println("Thank You for using my Calculator 2.0");
    }
}