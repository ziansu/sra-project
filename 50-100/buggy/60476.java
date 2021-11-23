public void onTripFinished(com.cst.model.clinic.Trip trip) throws com.cst.exceptions.NoDoctorAvailableException {
    for (com.cst.model.patient.Patient patient : trip.getPatients()) {
        com.cst.model.employee.Doctor doctor = this.getFreeDoctor();
        com.cst.model.clinic.Operation operation = new com.cst.model.clinic.Operation(doctor, patient);
        this.operations.add(operation);
        this.dispatcher.notify(new com.cst.model.clinic.OperationStarted(operation));
    }
}