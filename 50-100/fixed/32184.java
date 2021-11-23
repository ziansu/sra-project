public void setCategory() {
    if (isFloating()) {
        TO.setCategory("floating");
    }else
        if (isRecurring()) {
            TO.setCategory("recurring");
        }else
            if (isDeadline()) {
                TO.setCategory("deadline");
                TO.setEndTime(TO.getStartTime());
                TO.setEndDate(TO.getStartDate());
            }else {
                TO.setCategory("event");
            }
        
    
}