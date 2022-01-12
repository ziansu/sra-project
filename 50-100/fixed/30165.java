protected boolean validateDate(int year, int month, int day) throws com.projects.utils.common.realworld.personal.time.dates.birthday.InvalidDateException {
    try {
        java.util.Calendar calendarForValidation = java.util.Calendar.getInstance();
        calendarForValidation.setTimeInMillis(0);
        calendarForValidation.set(year, month, day);
        return true;
    } catch (java.lang.Exception e) {
        throw new com.projects.utils.common.realworld.personal.time.dates.birthday.InvalidDateException("The passed values do not form a valid date.");
    }
}