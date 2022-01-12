private void checkMI() {
    int MIIndex = java.util.Arrays.asList(dataentrymain.Utility.fieldOrder).indexOf("MI");
    java.lang.String input = record.getMI();
    input = input.replace(" ", "");
    if ((input.length()) <= 1) {
        fieldInformation[MIIndex] = 1;
        if ((input.length()) == 0) {
            record.setMI("N/A");
        }else {
            record.setMI(input);
        }
    }
}