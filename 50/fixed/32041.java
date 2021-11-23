@java.lang.Override
public org.openmrs.module.muzimabiometrics.MuzimaFingerprint findByPatientUUID(java.lang.String patientUUID) {
    return ((org.openmrs.module.muzimabiometrics.MuzimaFingerprint) (session().createQuery((("from MuzimaFingerprint m where m.patientUUID = '" + patientUUID) + "'")).uniqueResult()));
}