public com.cybor.gamehorse.core.Horse copy() {
    com.cybor.gamehorse.core.Horse horse = new com.cybor.gamehorse.core.Horse();
    horse.setX(x);
    horse.setY(y);
    horse.setState(state);
    horse.setOnPositionChangeListener(onPositionChangeListener);
    setOnPositionChangeListener(null);
    return horse;
}