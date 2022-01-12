private void checkAdd2() {
    int add2Index = java.util.Arrays.asList(dataentrymain.Utility.fieldOrder).indexOf("addressLine2");
    java.lang.String input = record.getAddressLine2();
    java.lang.String tempStr = input.replace(" ", "");
    if ((input.length()) <= 35) {
        fieldInformation[add2Index] = 1;
        if ((tempStr.length()) == 0) {
            record.setAddressLine2("N/A");
        }else {
            record.setAddressLine1(input);
        }
    }
}