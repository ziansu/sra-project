public void setLocationRemainingCapacity(edu.pddl.mmcr.model.Location location, java.lang.Integer capacity) {
    if (capacity.equals(location.getRemainingCapacity())) {
        location.setRemainingCapacity(capacity);
        java.awt.event.ActionEvent event = new java.awt.event.ActionEvent(location, java.awt.event.ActionEvent.ACTION_PERFORMED, Constants.OPERATION_UPDATE);
        notifyListeners(event);
        fileChangedFlag = true;
    }
}