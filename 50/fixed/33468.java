public void makeNextNotificationTime(java.util.Calendar rightNow) {
    if (repeatDaysEnabled) {
        makeNextRepeatDays();
    }else
        if (repeatEveryBlankDaysEnabled) {
            makeNextRepeatEveryBlankDays();
        }else {
            return ;
        }
    
}