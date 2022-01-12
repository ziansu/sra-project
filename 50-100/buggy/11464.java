@org.junit.Test
public void testSaveEncounter() {
    edu.psu.sweng500.emrms.model.HPatient hPatient = new edu.psu.sweng500.emrms.model.HPatient();
    edu.psu.sweng500.emrms.model.HEncounter hEncounter = new edu.psu.sweng500.emrms.model.HEncounter();
    hEncounter.sethEncounterID(1001);
    hEncounter.setUserID("admin");
    hEncounter.setCreationDateTime("2017-09-23 21:55:00");
    hEncounter.setEncStartDateTime("2017-09-14 11:55:00");
    hEncounter.setEncStatus(1);
    hEncounter.setEncLocationName("Exton Clinic");
    hEncounter.setEncounterType("OP");
    hEncounter.setEncounterID("Acc1001");
    hEncounter.setPatient_ObjectID(3);
    hEncounter.setAttendingPhysician_ObjectID(1);
    hEncounter.setBed_ObjectID(1);
}