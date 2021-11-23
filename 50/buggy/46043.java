public static void setRadioStationsToNormalMode(java.util.List<com.verrev.code.radiostation.RadioStation> stations) {
    for (com.verrev.code.radiostation.RadioStation r : stations)
        r.setIsInEmergencyMode(false);
    
}