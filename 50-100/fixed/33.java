@java.lang.Override
public void run() {
    int delay = java.util.concurrent.ThreadLocalRandom.current().nextInt(10, (40 + 1));
    org.myrobotlab.service.InMoovEyelids.blinkEyesTimer.schedule(new org.myrobotlab.service.InMoovEyelids.blinkEyesTimertask(), (delay * 1000));
    blink();
    if ((java.util.concurrent.ThreadLocalRandom.current().nextInt(0, (1 + 1))) == 1) {
        sleep(java.util.concurrent.ThreadLocalRandom.current().nextInt(1000, (2000 + 1)));
        blink();
    }
}