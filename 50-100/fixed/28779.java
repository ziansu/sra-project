private void addNewCrime() {
    com.example.savagavran.criminalintent.Crime crime = new com.example.savagavran.criminalintent.Crime();
    com.example.savagavran.criminalintent.CrimeLab lab = com.example.savagavran.criminalintent.CrimeLab.get(getActivity());
    lab.addCrime(crime);
    mNoCrimesLayout.setVisibility(View.INVISIBLE);
    mAdapter.setCrimes(lab.getCrimes());
    mCrimePosition = null;
    mCallbacks.onCrimeSelected(crime, mSubtitleVisible, com.example.savagavran.criminalintent.CrimeListFragment.REQUEST_DELETE_CRIME);
}