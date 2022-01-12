public int getSecondsLeft() {
    if (pause)
        return (timeLeft) / 1000;
    
    return (((timeLeft) - ((parent.millis()) - (startTime))) / 1000) + 1;
}