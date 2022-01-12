@java.lang.Override
public synchronized void setSteerValue(int value) {
    if (value != (currentSteerValue)) {
        currentSteerValue = constrainInVCURange(value);
    }
}