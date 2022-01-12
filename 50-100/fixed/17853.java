private java.util.Collection<at.oculus.teamf.domain.entity.Patient> getPatientByFirstName(java.util.Collection<at.oculus.teamf.domain.entity.Patient> patients, java.lang.String firstName) {
    java.util.Collection<at.oculus.teamf.domain.entity.Patient> selectedPatients = new java.util.LinkedList<at.oculus.teamf.domain.entity.Patient>();
    for (at.oculus.teamf.domain.entity.Patient patient : patients) {
        if (patient.getFirstName().equals(firstName)) {
            selectedPatients.add(patient);
        }
    }
    return selectedPatients;
}