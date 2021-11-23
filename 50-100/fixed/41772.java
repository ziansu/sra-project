@java.lang.Override
public void run() {
    do {
        if ((am.isMusicActive()) && (!(isMusicActive))) {
            isMusicActive = true;
            getTime();
        }
        if (!(am.isMusicActive()))
            isMusicActive = false;
        
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            continue;
        }
    } while (true );
}