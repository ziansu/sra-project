public synchronized void getService() {
    java.util.Random rand = new java.util.Random();
    try {
        java.lang.Thread.sleep((50 + (rand.nextInt(500))));
    } catch (java.lang.InterruptedException e) {
        return ;
    }
    if (_numbers.isEmpty())
        _numberOnDisplay = -1;
    else {
        java.lang.System.out.print(("Display:" + (_numbers.getFirst())));
        java.lang.System.out.println();
        _numberOnDisplay = _numbers.poll();
    }
}