public boolean canPreconditionSucceed(edu.wpi.cetask.Plan eventPlan) {
    return (collaboration.getPreconditionValue(eventPlan)) != null ? true : false;
}