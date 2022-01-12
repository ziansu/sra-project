@java.lang.Override
public org.joda.time.LocalDate generateNextScheduleDateStartingFromDisburseDate(org.joda.time.LocalDate lastRepaymentDate, org.mifosplatform.portfolio.loanaccount.loanschedule.domain.LoanApplicationTerms loanApplicationTerms, final org.mifosplatform.portfolio.loanaccount.data.HolidayDetailDTO holidayDetailDTO) {
    java.util.List<org.joda.time.LocalDate> adjustedRepaymentDateList = new java.util.ArrayList<>();
    org.joda.time.LocalDate generatedDate = loanApplicationTerms.getExpectedDisbursementDate();
    boolean isFirstRepayment = true;
    while (!(generatedDate.isAfter(lastRepaymentDate))) {
        generatedDate = generateNextRepaymentDate(generatedDate, loanApplicationTerms, isFirstRepayment, holidayDetailDTO);
        isFirstRepayment = false;
    } 
    generatedDate = adjustRepaymentDate(generatedDate, loanApplicationTerms, holidayDetailDTO, adjustedRepaymentDateList);
    return generatedDate;
}