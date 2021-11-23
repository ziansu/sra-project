public void init(java.lang.String portName) throws com.barnum.lcd.LCDException {
    sPort.openPort();
    sPort.setParams(com.barnum.lcd.LCD.BAUD_RATE, com.barnum.lcd.LCD.DATA_BITS, com.barnum.lcd.LCD.STOP_BITS, com.barnum.lcd.LCD.PARITY);
}