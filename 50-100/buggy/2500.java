public void run() {
    while (true) {
        if ((stepsToDo) > 0) {
            tick();
            (stepsToDo)--;
        }else {
            try {
                java.lang.Thread.sleep(tickPause);
            } catch (java.lang.InterruptedException e) {
                java.lang.System.out.println("sleep failed");
                e.printStackTrace();
            }
        }
    } 
}