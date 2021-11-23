@java.lang.Override
public void onNext(com.mifos.objects.zipmodels.LoanAndLoanRepayment loanAndLoanRepayment) {
    getMvpView().updateSingleSyncClientProgressBar(mLoanAndRepaymentSyncIndex);
    mLoanAndRepaymentSyncIndex = (mLoanAndRepaymentSyncIndex) + 1;
    if ((mLoanAndRepaymentSyncIndex) < (mLoanAccountList.size())) {
        syncLoanAndLoanRepayment(mLoanAccountList.get(mLoanAndRepaymentSyncIndex).getId());
    }else {
        syncClient(mClientList.get(mClientSyncIndex));
    }
}