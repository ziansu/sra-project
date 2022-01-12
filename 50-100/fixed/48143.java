private static void stopMedication(java.lang.String med, org.mitre.synthea.modules.Person person, long time) {
    if (person.record.medicationActive(med)) {
        java.util.List<java.lang.String> medChanges = ((java.util.List<java.lang.String>) (person.attributes.get("cardiovascular_disease_med_changes")));
        if (medChanges == null) {
            medChanges = new java.util.LinkedList<java.lang.String>();
            person.attributes.put("cardiovascular_disease_med_changes", medChanges);
        }
        medChanges.add(med);
    }
}