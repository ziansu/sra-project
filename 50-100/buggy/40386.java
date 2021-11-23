public boolean getCriteria() {
    switch (this) {
        default :
        case NEVER :
            return true;
        case OCCURENCE :
            int occurence = ((java.lang.Integer) (this.stopCriteria));
            if (occurence > 0) {
                this.stopCriteria = --occurence;
                return true;
            }else
                return false;
            
        case DATE :
            return new java.util.Date().before(((java.util.Date) (stopCriteria)));
    }
}