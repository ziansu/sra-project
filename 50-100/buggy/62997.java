public void showAddWineryDialog(final android.view.View view) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("searchText", this.etWinerySearch.getText().toString());
    com.robcutmore.vinotes.ui.AddWineryFragment newFragment = new com.robcutmore.vinotes.ui.AddWineryFragment();
    newFragment.setArguments(bundle);
    newFragment.show(getFragmentManager(), "wineryAdder");
}