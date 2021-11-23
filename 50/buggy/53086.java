public boolean isInitialRestMode() {
    return (this.isResting()) && (((hillbillies.model.Rest) (this.activityController.getCurrentActivity())).isInitialRestMode());
}