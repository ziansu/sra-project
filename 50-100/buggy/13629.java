public java.lang.String getGreeting() {
    java.util.Calendar calender = java.util.Calendar.getInstance();
    int hour = calender.get(java.util.Calendar.HOUR_OF_DAY);
    java.lang.String greeting = "";
    if (hour < 12) {
        greeting = "Good Morning... \n Welcome to your media library";
    }else
        if ((hour > 12) && (hour < 16)) {
            greeting = "Good Afternoon... \n Welcome to your media library";
        }else
            if (hour >= 16) {
                greeting = "Good Evening... \n Welcome to your media library";
            }
        
    
    return greeting;
}