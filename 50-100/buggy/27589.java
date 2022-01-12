@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View view, int position, long id) {
    if (((ca.ualberta.cmput301w15t13.Activities.ExpenseActivity) (getActivity())).isClaimant()) {
        ca.ualberta.cmput301w15t13.Models.Claim ourClaim = ca.ualberta.cmput301w15t13.Controllers.ClaimListSingleton.getClaimList().getClaimAtIndex(claimIndex);
        ((ca.ualberta.cmput301w15t13.Activities.ExpenseActivity) (getActivity())).viewExpense(claimIndex);
    }
}