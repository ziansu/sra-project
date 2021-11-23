public void updateTimeLeft() {
    if ((startTime) >= 0) {
        (startTime)--;
        int minutes = (startTime) / 60;
        int sec = (startTime) % 60;
        java.lang.String seconds = java.lang.Integer.toString(((startTime) % 60));
        if ((sec >= 0) && (sec <= 9)) {
            seconds = "0".concat(seconds);
        }
        timeRemaining = (minutes + ":") + seconds;
        setChanged();
        notifyObservers();
    }
}