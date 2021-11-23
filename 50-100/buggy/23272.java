private static boolean promptShutDownInput() {
    java.lang.String consoleInput;
    java.io.BufferedReader consoleIn = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    boolean isShutDown = false;
    try {
        java.lang.System.out.println("Please enter Q/q to terminate.");
        consoleInput = consoleIn.readLine();
        if ((consoleInput.equals("q")) || (consoleInput.equals("Q"))) {
            isShutDown = true;
        }
        consoleIn.close();
    } catch (java.io.IOException ioEx) {
        ioEx.printStackTrace();
    }
    return isShutDown;
}