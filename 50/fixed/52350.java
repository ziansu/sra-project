public java.lang.String getFullDateString(int month, int day, int year) {
    return ((((getMonthString(month)) + " ") + day) + ", ") + year;
}