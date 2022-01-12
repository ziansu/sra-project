public void run() {
    init();
    long startTime = java.lang.System.currentTimeMillis();
    boolean succ = calc(0, 0);
    long endTime = java.lang.System.currentTimeMillis();
    java.lang.System.out.println((("Total time: " + (((float) (startTime - endTime)) / 1000)) + "s"));
    java.lang.System.out.println(succ);
    printSudoku();
}