public static void main(java.lang.String[] args) throws java.lang.InterruptedException {
    int numberOfTests = 10;
    for (int i = 0; i < numberOfTests; i++) {
        boolean success = Main.testLauf();
        if (!success) {
            break;
        }
    }
}