public void changeVolume(double volume) {
    if (volume > 500) {
        volume = 500;
    }
    cow.setVolume(127);
}