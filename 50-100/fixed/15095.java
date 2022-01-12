@org.junit.Test
public void testEmergencyMode() {
    com.verrev.code.radiostation.RadioStationController.setRadioStationsToEmergencyMode();
    for (com.verrev.code.radiostation.RadioStation r : stations)
        org.junit.Assert.assertTrue(r.isInEmergencyMode());
    
    com.verrev.code.radiostation.RadioStationController.setRadioStationsToNormalMode();
    for (com.verrev.code.radiostation.RadioStation r : stations)
        org.junit.Assert.assertFalse(r.isInEmergencyMode());
    
}