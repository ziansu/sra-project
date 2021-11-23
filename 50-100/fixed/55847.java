private void updateUI() {
    com.bigranch.android.criminalintent.CrimeLab crimeLab = com.bigranch.android.criminalintent.CrimeLab.get(getActivity());
    java.util.List<com.bigranch.android.criminalintent.Crime> crimes = crimeLab.getCrimes();
    if ((mAdapter) == null) {
        mAdapter = new com.bigranch.android.criminalintent.CrimeListFragment.CrimeAdapter(crimes);
        mCrimeRecyclerView.setAdapter(mAdapter);
    }else {
        mCrimeRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}