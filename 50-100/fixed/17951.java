public boolean isLightGreenAtTime(double time) {
    boolean willBeGreen = false;
    if ((this.currentColor) == (simulator.models.StopLight.Color.GREEN)) {
        willBeGreen = true;
    }
    double newTimeUntilChange = timeUntilColorChange;
    while (time > newTimeUntilChange) {
        time -= newTimeUntilChange;
        if (willBeGreen) {
            newTimeUntilChange = timeAsRed;
        }else {
            newTimeUntilChange = timeAsGreen;
        }
        willBeGreen = !willBeGreen;
    } 
    return willBeGreen;
}