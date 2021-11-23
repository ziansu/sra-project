void onPause() {
    isThatOk = false;
    try {
        if ((myThread) != null)
            myThread.join();
        
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    myThread = null;
}