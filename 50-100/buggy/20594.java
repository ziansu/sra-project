@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    android.util.Log.d(edu.pdx.ece558_fall15.alex_elizabeth.businesscardcontact.ContactListActivity.TAG, "onSaveInstanceState");
    removeDetailFragmentUI();
    super.onSaveInstanceState(outState);
    if ((mCurrContactEntry) != null) {
        outState.putSerializable(edu.pdx.ece558_fall15.alex_elizabeth.businesscardcontact.ContactListActivity.KEY_ENTRY_ID, mCurrContactEntry.getId());
    }
}