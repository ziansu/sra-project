public void run() throws java.lang.InterruptedException {
    m.Start();
    for (int i = 1; i < 300; i++) {
        java.lang.Thread.sleep(100);
        java.lang.System.out.println((((m.runningSeconds().ToString) + "sec:") + (balancer.printlnBalancer.getLine(m.getAngle()))));
    }
    m.Stop();
}