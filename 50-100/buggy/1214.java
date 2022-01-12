public void run() {
    Sistema.ActiveProcesso = true;
    while (true) {
        try {
            java.lang.Thread.sleep(1000);
            java.lang.System.out.println((("Sistema verificando a cada " + (this.intervaloDeVerificacao)) + " segundos"));
            (tempo)++;
            if (((getTempo()) % (intervaloDeVerificacao)) == 0) {
                downMutex();
                detectarDeadLock();
                upMutex();
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}