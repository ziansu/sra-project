public boolean AddDiagnosis(java.lang.String diagnosis, java.lang.String patientID) {
    boolean addedDiagnosis = false;
    medicalrecords.Patient patient = this.getDatabaseInstance().getPatient(patientID);
    if (patient != null) {
        addedDiagnosis = patient.AddDiagnosis(diagnosis);
        if (addedDiagnosis) {
            addedDiagnosis = this.getDatabaseInstance().putPatient(patient);
        }
        return addedDiagnosis;
    }
    return addedDiagnosis;
}