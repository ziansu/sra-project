public void sendState(com.example.albertoni.joysticksimulator.Joystick.Direction direction) throws java.lang.IllegalStateException {
    if (!(isConnected())) {
        throw new java.lang.IllegalStateException();
    }
    if (direction != (previousDirection)) {
        try {
            exit.write(direction.getValue());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}