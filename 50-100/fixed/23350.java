public void initFragments() {
    fm = getSupportFragmentManager();
    home_fragment = new com.app.swe443.openbankapp.HomeFrag();
    transfer_fragment = new com.app.swe443.openbankapp.TransferFrag();
    transaction_fragment = new com.app.swe443.openbankapp.TransactionFrag();
    contacts_fragment = new com.app.swe443.openbankapp.ContactsFrag();
    transaction = fm.beginTransaction();
    transaction.replace(R.id.contentFragment, home_fragment, "HOME_FRAGMENT");
    transaction.commit();
}