public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.i(kelvinycchan.a12googlesheetcheck_insystem.CheckInActivity.TAG, java.lang.String.format("Picked [%s]", which));
    ltParticipantsPicked = ltParticipantsMatched.get(which);
    mSectionsPagerAdapter.setParticipantList(ltParticipantsPicked);
    mViewPager.setAdapter(mSectionsPagerAdapter);
    mSectionsPagerAdapter.notifyDataSetChanged();
}