public void wait(int t) throws java.lang.InterruptedException {
    t *= 1000 * 1000;
    long initialTime = java.lang.System.nanoTime();
    while (((java.lang.System.nanoTime()) - initialTime) < t) {
        idle();
    } 
}