public org.usfirst.frc2832.Robot_2016.HID.GamepadState getCurrentState() {
    long time = java.lang.System.currentTimeMillis();
    while (((states.get(lastIndex).timestamp) - (recordedOffset)) <= (time - (startTime)))
        (lastIndex)++;
    
    (lastIndex)--;
    if ((lastIndex) >= (states.size())) {
        done = true;
        return null;
    }
    return states.get(lastIndex);
}