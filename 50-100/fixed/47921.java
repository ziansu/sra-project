private void updateUI() {
    com.aliciamaclennan.criminalintent.CrimeLab crimeLab = com.aliciamaclennan.criminalintent.CrimeLab.get(getActivity());
    java.util.List<com.aliciamaclennan.criminalintent.Crime> crimes = crimeLab.getCrimes();
    mAdapter = new com.aliciamaclennan.criminalintent.CrimeListFragment.CrimeAdapter(crimes);
    mCrimeRecyclerView.setAdapter(mAdapter);
    updateSubtitle();
}