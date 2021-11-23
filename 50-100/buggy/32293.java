public void startThread() {
    t.setName("T");
    t.start();
    modifier = getClass().getSimpleName();
    SpMap.checkThread();
    try {
        t.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(("Last Modifier is " + (modifier)));
}