public java.lang.Process startTerm() {
    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
    try {
        java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder(_argsWithPath);
        java.lang.Process p = pb.start();
        return p;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}