public static int getTimeInt() {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    int hours = calendar.getTime().getHours();
    if (hours < 12)
        return hours - 7;
    else
        if ((hours >= 12) && (hours < 18))
            return (hours - 12) + 4;
        else
            if (hours >= 18)
                return (hours - 17) + 8;
            else
                return 0;
            
        
    
}