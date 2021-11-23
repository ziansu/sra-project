public org.openmrs.Patient convert(org.openmrs.module.registrationcore.api.mpi.openempi.OpenEmpiPatientQuery patientQuery) {
    return convertPatient(new org.openmrs.module.registrationcore.api.mpi.common.MpiPatient(), patientQuery);
}