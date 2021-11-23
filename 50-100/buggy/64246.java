@java.lang.Override
public boolean isMember(org.phenotips.data.Patient patient) {
    java.util.List<java.lang.String> members = getMembers();
    if (members == null) {
        return false;
    }
    java.lang.String patientId = patient.getDocument().toString();
    return members.contains(patientId);
}