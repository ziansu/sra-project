public void receiveData(byte[] data) {
    if (((mouseActive) == 1) && (propEnableMouse)) {
        if ((propAbsolutePosition) == true) {
            mouseXPos = eu.asterics.component.actuator.mouse.ConversionUtils.doubleFromBytes(data);
        }else {
            mouseXPos = (mouseXPos) + (eu.asterics.component.actuator.mouse.ConversionUtils.doubleFromBytes(data));
        }
        if ((mouseXPos) != (mouseLastXPos))
            updateMousePosition();
        
    }
}