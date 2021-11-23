@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    getListView().setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
    android.widget.TextView tv = ((android.widget.TextView) (view.findViewById(R.id.tvKontoname)));
    java.lang.StringBuffer fragmentHeader = new java.lang.StringBuffer(de.aw.gv.Account.getAccountName(accountID)).append(" - ").append(getString(R.string.offeneBuchungen));
    tv.setText(fragmentHeader);
}