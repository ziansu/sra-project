protected boolean tryExecute(java.lang.String[] command) {
    java.lang.String[] output = execute(command);
    if ((output[1].length()) > 0) {
        java.lang.System.err.println((("Ooops! Command execution (" + (command[0])) + ") failed with message: "));
        java.lang.System.err.println(output[1]);
        return false;
    }
    if (output != null) {
        java.lang.System.out.println(output[0]);
    }
    return true;
}