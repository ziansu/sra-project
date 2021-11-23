@java.lang.Override
protected void onResume() {
    super.onResume();
    com.vickysy.ootd.NewItemFragment df = ((com.vickysy.ootd.NewItemFragment) (getSupportFragmentManager().findFragmentById(R.id.fragment_new_item)));
    df.onItemEdit();
}