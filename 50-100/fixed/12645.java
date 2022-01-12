@java.lang.Override
public void run() {
    target.receiveHealing(output);
    increaseCurrentTimer();
    java.lang.System.out.println(("Renew is ticking! " + (currentTime)));
    if ((currentTime) >= (duration)) {
        target.removeEffect(EffectType.HEALOVERTIME);
        java.lang.System.out.println("Renew expired");
    }
}