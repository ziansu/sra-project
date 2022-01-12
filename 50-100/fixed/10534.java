public java.util.List<org.neo4j.data.generator.domains.medicalrecords.encounters.Encounter> encountersSince(org.joda.time.LocalDate dateOfBirth) {
    java.util.ArrayList<org.neo4j.data.generator.domains.medicalrecords.encounters.Encounter> encounters = new java.util.ArrayList<org.neo4j.data.generator.domains.medicalrecords.encounters.Encounter>();
    org.joda.time.LocalDate currentDate = dateOfBirth;
    org.joda.time.LocalDate today = new org.joda.time.LocalDate();
    while (currentDate.isBefore(today)) {
        encounters.add(encounterGenerator.nextEncounter(currentDate));
        currentDate = currentDate.plusDays(((int) (((java.lang.Math.random()) * 365) * (org.neo4j.data.generator.domains.medicalrecords.encounters.EncounterSequenceGenerator.MAX_YEARS_BETWEEN_ENCOUNTERS))));
    } 
    return encounters;
}