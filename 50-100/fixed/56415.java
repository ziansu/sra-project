@org.junit.Test
public void shouldBeRejectedDueToAbnormalLoanAmount() {
    com.example.loan.model.LoanApplication application = new com.example.loan.model.LoanApplication(new com.example.loan.model.Client("1234567890"), 99999);
    com.example.loan.model.LoanApplicationResult loanApplication = this.service.loanApplication(application);
    org.assertj.core.api.Assertions.assertThat(loanApplication.getLoanApplicationStatus()).isEqualTo(LoanApplicationStatus.LOAN_APPLICATION_REJECTED);
    org.assertj.core.api.Assertions.assertThat(loanApplication.getRejectionReason()).isEqualTo("Amount too high");
}