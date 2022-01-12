public void showAddWineryDialog(final android.view.View view) {
    android.os.Bundle args = new android.os.Bundle();
    args.putString("searchText", this.etWinerySearch.getText().toString());
    com.robcutmore.vinotes.ui.AddWineryFragment newFragment = new com.robcutmore.vinotes.ui.AddWineryFragment();
    newFragment.setArguments(args);
    newFragment.show(getFragmentManager(), "wineryAdder");
}