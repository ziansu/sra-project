@java.lang.Override
public synchronized void setThrottle(int value) {
    if (value != (currentThrottleValue)) {
        currentThrottleValue = constrainInVCURange(value);
        java.lang.System.out.println(("Throttle: " + (currentThrottleValue)));
        sendValuesToCar();
    }
}