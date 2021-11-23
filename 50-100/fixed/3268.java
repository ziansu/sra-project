public static int getTimeInt() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    int hours = calendar.getTime().getHours();
    if ((hours < 12) && (hours >= 8))
        return hours - 7;
    
    if ((hours >= 13) && (hours < 17))
        return (hours - 12) + 4;
    
    if ((hours >= 18) && (hours < 23))
        return (hours - 17) + 8;
    
    return 0;
}