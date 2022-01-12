@org.junit.Test
public void shouldSuccessfullyApplyForLoan() {
    com.example.loan.model.LoanApplication application = new com.example.loan.model.LoanApplication(new com.example.loan.model.Client("1234567890"), 123.123);
    com.example.loan.model.LoanApplicationResult loanApplication = this.service.loanApplication(application);
    org.assertj.core.api.Assertions.assertThat(loanApplication.getLoanApplicationStatus()).isEqualTo(LoanApplicationStatus.LOAN_APPLIED);
    org.assertj.core.api.Assertions.assertThat(loanApplication.getRejectionReason()).isNull();
}