private void updateUI() {
    com.example.illum.criminalintent.CrimeLab crimeLab = com.example.illum.criminalintent.CrimeLab.get(getActivity());
    java.util.List<com.example.illum.criminalintent.Crime> crimes = crimeLab.getCrimes();
    if ((mAdapter) == null) {
        mAdapter = new com.example.illum.criminalintent.CrimeListFragment.CrimeAdapter(crimes);
        mCrimeRecyclerView.setAdapter(mAdapter);
    }else {
        mAdapter.notifyItemChanged(com.example.illum.criminalintent.CrimeFragment.getLastModifiedCrimePosition());
    }
}