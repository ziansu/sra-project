public static void setPreferences() {
    if ((org.rbdc.sra.helperClasses.CRUDFlinger.application) == null) {
    }
    if (((org.rbdc.sra.helperClasses.CRUDFlinger.loader) == null) || ((org.rbdc.sra.helperClasses.CRUDFlinger.saver) == null)) {
        java.lang.System.out.println(("hello crud" + (org.rbdc.sra.helperClasses.CRUDFlinger.application)));
        org.rbdc.sra.helperClasses.CRUDFlinger.loader = org.rbdc.sra.helperClasses.CRUDFlinger.application.getSharedPreferences("AppPrefs", org.rbdc.sra.helperClasses.CRUDFlinger.application.MODE_PRIVATE);
        org.rbdc.sra.helperClasses.CRUDFlinger.saver = org.rbdc.sra.helperClasses.CRUDFlinger.application.getSharedPreferences("AppPrefs", org.rbdc.sra.helperClasses.CRUDFlinger.application.MODE_PRIVATE).edit();
    }
}