private void sendValuesToCar() {
    arduinoCommunicator.write(((byte) (-128)));
    arduinoCommunicator.write(((byte) (128 + (currentSteerValue))));
    arduinoCommunicator.write(((byte) (-127)));
    arduinoCommunicator.write(((byte) (128 + (currentThrottleValue))));
}