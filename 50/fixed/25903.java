public void editPatient(ch.bfh.bti7081.s2017.grey.database.entity.Patient changedpatient, int patientId) {
    this.patient = changedpatient;
    patientService.updatePatient(patient);
}