private void updateAppointment() {
    if ((_selectedTask) != null) {
        _currentStoreAppointment.setStoreTask(_selectedTask);
        _currentStoreAppointment.setStartDate(_selectedWorker.getNextAvailability());
        _txtStartTime.setText(_currentStoreAppointment.getFormattedStartDate());
        _txtEndTime.setText(_currentStoreAppointment.getFormattedEndDate());
    }
}