public void startPleaseNewThread() {
    myThread = new A.B(iter, constructor);
    myThread.start();
    java.lang.System.out.println(("Call start new thread with iterator " + (iter)));
}