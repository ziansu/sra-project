@java.lang.Override
public void run() {
    while (true) {
        if ((run) == true) {
            try {
                java.lang.Thread.sleep(1000);
                board.increaseNumberOfSeconds();
                board.decreaseNumberOfLifeSeconds(1);
                board.checkOutOfTime();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
}