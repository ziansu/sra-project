public Kubaner.Logic.Time addMinutes(int additionalMinutes) {
    if (additionalMinutes < 0)
        throw new java.lang.IllegalArgumentException("Cannot add a negative amount of minutes.");
    
    int newMinutes = ((this.minute) + additionalMinutes) % 60;
    int additionalHours = ((this.minute) + additionalMinutes) / 60;
    int newHour = ((this.hour) + additionalHours) % 24;
    this.hour = newHour;
    this.minute = newMinutes;
    return this;
}