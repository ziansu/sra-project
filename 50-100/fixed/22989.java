public static void main(java.lang.String[] args) throws java.lang.InterruptedException {
    int numberOfTests = 1;
    for (int i = 0; i < numberOfTests; i++) {
        boolean success = Main.testLauf();
        if (!success) {
            break;
        }
    }
}