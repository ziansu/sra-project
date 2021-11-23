public static void main(java.lang.String[] args) {
    long startTime = java.lang.System.currentTimeMillis();
    RunNewAlg.runOnData(0, 0.3, 0.3, 4, 10);
    double duration = (java.lang.System.currentTimeMillis()) - startTime;
    java.lang.System.out.println((("\nTime taken: " + (duration / 1000)) + " seconds"));
}