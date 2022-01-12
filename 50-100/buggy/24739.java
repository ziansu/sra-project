@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void deleteLoanCreditChecks(final org.mifosplatform.portfolio.loanaccount.domain.Loan loan) {
    java.util.Collection<org.mifosplatform.portfolio.loanaccount.domain.LoanCreditCheck> loanCreditCheckList = loan.getCreditChecks();
    if (org.apache.commons.collections.CollectionUtils.isNotEmpty(loanCreditCheckList)) {
        for (org.mifosplatform.portfolio.loanaccount.domain.LoanCreditCheck loanCreditCheck : loanCreditCheckList) {
            loanCreditCheck.updateIsDeleted(true);
            this.loanCreditCheckRepository.save(loanCreditCheck);
        }
    }
}