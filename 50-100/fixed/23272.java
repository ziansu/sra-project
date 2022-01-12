private static boolean promptShutDownInput(java.io.BufferedReader consoleIn) {
    java.lang.String consoleInput;
    boolean isShutDown = false;
    try {
        java.lang.System.out.println("Please enter Q/q to terminate.");
        consoleInput = consoleIn.readLine();
        if ((consoleInput.equals("q")) || (consoleInput.equals("Q"))) {
            isShutDown = true;
        }
    } catch (java.io.IOException ioEx) {
        ioEx.printStackTrace();
    }
    return isShutDown;
}