public static void setAllLevels(com.smartdevicelink.trace.enums.DetailLevel thisDetail) {
    if (thisDetail != null) {
        for (int i = 0; i < (com.smartdevicelink.trace.DiagLevel.levels.length); i++) {
            com.smartdevicelink.trace.DiagLevel.levels[i] = thisDetail;
        }
    }
}