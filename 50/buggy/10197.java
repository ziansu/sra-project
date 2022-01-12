public void startPleaseNewThread() {
    myThread = new A.B(iter, constructor);
    myThread.start();
    isRunning = true;
    java.lang.System.out.println(("Call start new thread with iterator " + (iter)));
}