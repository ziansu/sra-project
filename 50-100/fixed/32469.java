private void showDate(int year, int month, int day) {
    month = month + 1;
    java.lang.String fixedMonth = (month < 10) ? "0" + month : "" + month;
    java.lang.String fixedDay = (day < 10) ? "0" + day : "" + day;
    dateOfBirthET.setText(new java.lang.StringBuilder().append(year).append("-").append(fixedMonth).append("-").append(fixedDay));
}