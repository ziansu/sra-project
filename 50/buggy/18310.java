public int getSecondsLeft() {
    if (pause)
        return timeLeft;
    
    return (((timeLeft) - ((parent.millis()) - (startTime))) / 1000) + 1;
}