public static void measureAndPrint(java.lang.Runnable runnable) {
    stopwatch.Stopwatch timer = new stopwatch.Stopwatch();
    timer.start();
    runnable.run();
    timer.stop();
    java.lang.System.out.println(runnable.toString());
    java.lang.System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());
}