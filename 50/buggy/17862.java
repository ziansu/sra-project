public void setFullDutyReturnDate(java.util.Calendar fullDutyReturnDate) {
    this.fullDutyReturnDate = fullDutyReturnDate;
    if ((this.fullDutyReturnDate) != null) {
        computeDaysAndWeeksInjured();
    }
}