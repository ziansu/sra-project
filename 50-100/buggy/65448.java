public void run() {
    if ((rate) <= 0) {
        return ;
    }
    while (!(java.lang.Thread.interrupted())) {
        try {
            beat();
            java.lang.Thread.sleep(((rate) * 51));
        } catch (java.lang.InterruptedException e) {
        }
    } 
}