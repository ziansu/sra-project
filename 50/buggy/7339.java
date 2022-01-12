@java.lang.Override
public void onPeriod(long nbPointsSinceLastPeriod) {
    if (isWaitForTrigger()) {
        setWaitForPeriod(false);
    }
}