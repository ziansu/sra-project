public boolean isDayJustCompleted() {
    return ((((getDayIndex(0)) != 0) && ((getDayIndex(0)) == (getDayIndex(1)))) && ((getHourIndex(0, getDayIndex(0))) == (getHourIndex(1, getDayIndex(1))))) && ((getHourIndex(0, getDayIndex(0))) == 0);
}