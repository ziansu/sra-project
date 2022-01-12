public static void defaultSetting() {
    com.ubicomp.ketdiary.system.PreferenceControl.setUID("rehab_default_test");
    com.ubicomp.ketdiary.system.PreferenceControl.setDeviceId("ket_000");
    com.ubicomp.ketdiary.system.PreferenceControl.setIsDeveloper(true);
    java.util.Calendar cal = java.util.Calendar.getInstance();
    com.ubicomp.ketdiary.system.PreferenceControl.setStartDate(cal.get(java.util.Calendar.YEAR), cal.get(java.util.Calendar.MONTH), cal.get(java.util.Calendar.DAY_OF_MONTH));
}