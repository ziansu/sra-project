@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.spinnerProposal :
            if ((proposalList.size()) > 0) {
                java.lang.String[] occuArr = new java.lang.String[proposalList.size()];
                occuArr = proposalList.toArray(occuArr);
                com.idbi.idbi.helper.CommonMethods.showSpinner(getActivity(), appNoSpinner, occuArr, customSpinnerListener);
            }
            break;
    }
}