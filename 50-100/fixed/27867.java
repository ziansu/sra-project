private void sendValuesToCar() {
    arduinoCommunicator.write(((byte) (0)));
    arduinoCommunicator.write(((byte) (128 + (currentSteerValue))));
    arduinoCommunicator.write(((byte) (1)));
    arduinoCommunicator.write(((byte) (128 + (currentThrottleValue))));
}