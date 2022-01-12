@java.lang.Override
public java.util.List<org.phenotips.data.Patient> getMembers() {
    java.util.List<java.lang.String> memberIds = this.getMembersIds();
    java.util.List<org.phenotips.data.Patient> members = new java.util.ArrayList<>(memberIds.size());
    for (java.lang.String memberId : memberIds) {
        org.phenotips.data.Patient patient = org.phenotips.studies.family.internal.XWikiFamily.patientRepository.getPatientById(memberId);
        members.add(patient);
    }
    return members;
}