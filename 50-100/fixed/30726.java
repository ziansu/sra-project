private void updateAppointmentInformation() {
    if ((_newTask) != null) {
        _newAppointment.setStoreTask(_newTask);
        if (_oldWorker.equals(_newWorker)) {
            _newAppointment.setStartDate(_oldAppointment.getStartDate());
        }else {
            _newAppointment.setStartDate(_newWorker.getNextAvailability());
        }
        _txtStartTime.setText(_newAppointment.getFormattedStartDate());
        _txtEndTime.setText(_newAppointment.getFormattedEndDate());
    }
}