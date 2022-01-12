private void saveHL7Obs(org.openmrs.Patient patient, ca.uhn.hl7v2.model.Message message, org.openmrs.Location location, org.openmrs.module.chirdlutilbackports.hibernateBeans.Session session, java.lang.String printerLocation) {
    java.lang.Runnable hl7ObsRunnable = new org.openmrs.module.chica.hl7.mckesson.HL7StoreObsRunnable(patient.getPatientId(), location.getLocationId(), session.getSessionId(), message, printerLocation);
    java.lang.Thread hl7ObsThread = new java.lang.Thread(hl7ObsRunnable);
    hl7ObsThread.start();
}