private void getFieldsInformation() {
    java.lang.Long tsLong = (java.lang.System.currentTimeMillis()) / 1000;
    timestamp = tsLong.toString();
    testingDate = ((((java.lang.String.valueOf(datepicker.getYear())) + ",") + (java.lang.String.valueOf(((datepicker.getMonth()) + 1)))) + ",") + (java.lang.String.valueOf(datepicker.getDayOfMonth()));
}