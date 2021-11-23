public void setFullDutyReturnDate(java.util.Calendar fullDutyReturnDate) {
    if ((this.fullDutyReturnDate) == null)
        return ;
    
    this.fullDutyReturnDate = fullDutyReturnDate;
    computeDaysAndWeeksInjured();
}