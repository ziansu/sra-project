public void run() {
    Sistema.ActiveProcesso = true;
    while (true) {
        try {
            java.lang.Thread.sleep(1000);
            (tempo)++;
            if (((getTempo()) % (intervaloDeVerificacao)) == 0) {
                detectarDeadLock();
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}