public void run() {
    if ((rate) <= 0) {
        return ;
    }
    while (!(java.lang.Thread.interrupted())) {
        try {
            java.lang.Thread.sleep(((rate) * 51));
            beat();
        } catch (java.lang.InterruptedException e) {
        }
    } 
}