void createRelationship(org.motechproject.ghana.national.domain.PatientType typeOfPatient, java.lang.String parentId, java.lang.String savedPatientId) throws org.motechproject.ghana.national.exception.ParentNotFoundException {
    if ((PatientType.CHILD_UNDER_FIVE.equals(typeOfPatient)) && (org.apache.commons.lang.StringUtils.isNotEmpty(parentId))) {
        org.motechproject.ghana.national.domain.Patient mother = getPatientById(parentId);
        if (mother == null) {
            throw new org.motechproject.ghana.national.exception.ParentNotFoundException();
        }
        final org.motechproject.ghana.national.domain.Patient child = getPatientById(savedPatientId);
        allPatients.createMotherChildRelationship(mother.mrsPatient().getPerson(), child.mrsPatient().getPerson());
    }
}