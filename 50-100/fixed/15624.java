public void setHours(int hour) {
    boolean pm = false;
    if (!(is24Hour)) {
        if (hour == 0) {
            hour = 12;
        }else
            if (hour == 12) {
                pm = true;
            }else
                if (hour > 12) {
                    hour -= 12;
                    pm = true;
                }
            
        
    }
    amButton.setChecked((!pm));
    pmButton.setChecked(pm);
    lastSelectionWasPm = pm;
    hours.setCurrent(hour);
}