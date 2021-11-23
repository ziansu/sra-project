private void updateUI() {
    com.aliciamaclennan.criminalintent.CrimeLab crimeLab = com.aliciamaclennan.criminalintent.CrimeLab.get(getActivity());
    java.util.List<com.aliciamaclennan.criminalintent.Crime> crimes = crimeLab.getCrimes();
    if ((mAdapter) == null) {
        mAdapter = new com.aliciamaclennan.criminalintent.CrimeListFragment.CrimeAdapter(crimes);
        mCrimeRecyclerView.setAdapter(mAdapter);
    }else {
        if ((mLastAdapterClickPosition) < 0) {
            mAdapter.notifyDataSetChanged();
        }else {
            mAdapter.notifyItemChanged(mLastAdapterClickPosition);
            mLastAdapterClickPosition = -1;
        }
    }
    updateSubtitle();
}