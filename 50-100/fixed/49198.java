private int calculateNumberOfWholeDaysToNextShuttle(int currentDay) {
    if ((currentDay < (com.concordia.mcga.helperClasses.MCGADayOfWeek.SUNDAY)) || (currentDay > (com.concordia.mcga.helperClasses.MCGADayOfWeek.SATURDAY)))
        return -1;
    
    if (currentDay == (com.concordia.mcga.helperClasses.MCGADayOfWeek.FRIDAY))
        return 2;
    
    if (currentDay == (com.concordia.mcga.helperClasses.MCGADayOfWeek.SATURDAY))
        return 1;
    
    return 0;
}