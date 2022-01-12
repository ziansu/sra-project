public org.usfirst.frc2832.Robot_2016.HID.GamepadState getCurrentState() {
    long time = java.lang.System.currentTimeMillis();
    while ((lastIndex) < (states.size())) {
        if (((states.get(lastIndex).timestamp) - (recordedOffset)) <= (time - (startTime)))
            (lastIndex)++;
        
    } 
    if ((lastIndex) >= (states.size())) {
        done = true;
        return null;
    }
    (lastIndex)--;
    return states.get(lastIndex);
}