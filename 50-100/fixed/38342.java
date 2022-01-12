private boolean isAcceptableDateChange(java.util.Date startDate, java.util.Date endDate) {
    if ((startDate != null) && (endDate == null)) {
        return false;
    }else
        if ((startDate == null) && (endDate == null)) {
            return true;
        }else
            if ((startDate == null) && (endDate != null)) {
                return true;
            }else
                if ((startDate.compareTo(endDate)) < 0) {
                    return true;
                }else {
                    return false;
                }
            
        
    
}