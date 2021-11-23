public org.joda.time.LocalDate getDate() {
    return new org.joda.time.LocalDate(mDatePicker.getYear(), ((mDatePicker.getMonth()) + 1), mDatePicker.getDayOfMonth());
}