public void enableDevice() {
    try {
        printer.setDeviceEnabled(true);
        java.lang.String[] lines = new java.lang.String[1];
        printer.getData(FPTR_GD_PRINTER_ID, null, lines);
        java.lang.System.out.println(("FPTR_GD_PRINTER_ID: " + (lines[0])));
        printer.setPOSID("1", "Кравцов В.В.");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}