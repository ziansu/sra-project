private java.util.List<org.catrobat.catroid.content.bricks.Brick> setupArduinoCategoryList() {
    java.util.List<org.catrobat.catroid.content.bricks.Brick> arduinoBrickList = new java.util.ArrayList<org.catrobat.catroid.content.bricks.Brick>();
    arduinoBrickList.add(new org.catrobat.catroid.content.bricks.ArduinoSendDigitalValueBrick(org.catrobat.catroid.common.BrickValues.ARDUINO_DIGITAL_INITIAL_PIN_NUMBER, org.catrobat.catroid.common.BrickValues.ARDUINO_DIGITAL_INITIAL_PIN_VALUE));
    arduinoBrickList.add(new org.catrobat.catroid.content.bricks.ArduinoSendPWMValueBrick(org.catrobat.catroid.common.BrickValues.ARDUINO_PWM_INITIAL_PIN_NUMBER, org.catrobat.catroid.common.BrickValues.ARDUINO_PWM_INITIAL_PIN_VALUE));
    return arduinoBrickList;
}