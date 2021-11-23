@java.lang.Override
public void onLoanListsChanged() {
    if ((loan) != null) {
        loan = org.bbt.kiakoa.model.LoanLists.getInstance().findLoanById(loan.getId());
        if ((loan) == null) {
            android.util.Log.e(org.bbt.kiakoa.fragment.LoanDetails.LoanDetailsFragment.TAG, "Cannot find loan when lists updated.");
            android.app.Activity activity = getActivity();
            if (activity instanceof org.bbt.kiakoa.LoanDetailsActivity) {
                getActivity().finish();
            }
        }
    }
    updateView();
}