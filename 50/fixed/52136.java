public java.lang.String getStdOut() {
    if (isRunning()) {
        throw new java.lang.IllegalStateException(("Cannot get output before executing command line: " + (cl)));
    }
    return inputOut.toString();
}