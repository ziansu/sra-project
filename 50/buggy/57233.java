public void setDateObject(java.lang.String input, java.time.format.DateTimeFormatter dateFormatter) {
    if ((dateObject) == (java.time.LocalDate.MAX)) {
        dateObject = java.time.LocalDate.parse(input, dateFormatter);
    }
}