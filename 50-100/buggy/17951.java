public boolean isLightGreenAtTime(double time) {
    boolean willBeGreen = true;
    double newTimeUntilChange = timeUntilColorChange;
    while (time > newTimeUntilChange) {
        time -= newTimeUntilChange;
        if ((this.currentColor) == (simulator.models.StopLight.Color.GREEN)) {
            willBeGreen = true;
            newTimeUntilChange = timeAsRed;
        }else {
            willBeGreen = false;
            newTimeUntilChange = timeAsGreen;
        }
    } 
    return willBeGreen;
}