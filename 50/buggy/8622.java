public static void main(java.lang.String[] args) {
    java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder();
    pb.command();
    try {
        pb.start();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}