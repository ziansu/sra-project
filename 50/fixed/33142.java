public boolean canPreconditionSucceed(edu.wpi.cetask.Plan eventPlan) {
    if ((collaboration.getPreconditionValue(eventPlan)) == null)
        return false;
    else
        if (collaboration.getPreconditionValue(eventPlan))
            return true;
        else
            return false;
        
    
}