void createRelationship(java.lang.String parentId, java.lang.String savedPatientId) throws org.motechproject.ghana.national.exception.ParentNotFoundException {
    org.motechproject.ghana.national.domain.Patient mother = getPatientById(parentId);
    if (mother == null) {
        throw new org.motechproject.ghana.national.exception.ParentNotFoundException();
    }
    org.motechproject.ghana.national.domain.Patient child = getPatientById(savedPatientId);
    allPatients.createMotherChildRelationship(mother.mrsPatient().getPerson(), child.mrsPatient().getPerson());
}