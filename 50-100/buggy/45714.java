public void checkTime() {
    if (alwayRun)
        return ;
    
    int hour = com.yi.utils.DateUtils.getCurrentHour();
    while ((hour < 9) || (hour > 15)) {
        java.lang.System.out.println(("The job only run between 9:00 and 15:00, the current hour is " + hour));
        sleep(60000);
    } 
}