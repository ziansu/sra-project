@java.lang.Override
public void run() {
    while ((!(endOfDay)) || (!(waitingToWash.isEmpty()))) {
        Car c = getCarOut();
        if (c != null)
            try {
                java.lang.Thread.sleep(1000);
                waitingToIntern.addLast(c);
                wakeUP();
            } catch (java.lang.InterruptedException | java.lang.NullPointerException e) {
                e.printStackTrace();
            }
        
    } 
}