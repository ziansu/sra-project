@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    mNoWarningsTextView.setVisibility(View.GONE);
    mAlergyTitleTextView.setVisibility(View.VISIBLE);
    mLineBelowTitleAlergies.setVisibility(View.VISIBLE);
    com.medic.medicapp.Warning warning = dataSnapshot.getValue(com.medic.medicapp.Warning.class);
    mWarningAlergyAdapter.add(warning);
    updateListHeight(mWarningAlergyListView, mWarningAlergyAdapter);
}