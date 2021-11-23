public Kubaner.Logic.Time addMinutes(int additionalMinutes) {
    if (additionalMinutes < 0)
        throw new java.lang.IllegalArgumentException("Cannot add a negative amount of minutes.");
    
    int newMinutes = ((this.minute) + additionalMinutes) % 60;
    int additionalHours = ((this.minute) + additionalMinutes) / 60;
    int newHour = ((this.hour) + additionalHours) % 24;
    Kubaner.Logic.Time newTime = new Kubaner.Logic.Time(newHour, newMinutes);
    return newTime;
}