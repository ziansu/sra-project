public void setCategory() {
    if (isFloating()) {
        TO.setCategory("floating");
    }else
        if (isDeadline()) {
            TO.setCategory("deadline");
            TO.setEndTime(TO.getStartTime());
            TO.setEndDate(TO.getStartDate());
        }else
            if (isRecurring()) {
                TO.setCategory("recurring");
            }else {
                TO.setCategory("event");
            }
        
    
}