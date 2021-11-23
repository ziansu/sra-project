public static void main(java.lang.String[] args) {
    long startTime = java.lang.System.currentTimeMillis();
    java.lang.System.out.println(hamming(1000000000, 100));
    long endTime = java.lang.System.currentTimeMillis();
    long totalTime = endTime - startTime;
    java.lang.System.out.println((("Total time: " + ((1.0 * totalTime) / 1000)) + " seconds"));
}