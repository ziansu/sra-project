@java.lang.Override
public void onCrimeSelected(com.mahovd.bignerdranch.criminalintent.Crime crime) {
    if ((findViewById(R.id.detail_fragment_container)) == null) {
        android.content.Intent intent = com.mahovd.bignerdranch.criminalintent.CrimePagerActivity.newIntent(this, crime.getId());
        startActivityForResult(intent, com.mahovd.bignerdranch.criminalintent.CrimeListActivity.REQUEST_CRIME);
    }else {
        android.support.v4.app.Fragment newDetail = com.mahovd.bignerdranch.criminalintent.CrimeFragment.newInstance(crime.getId(), true);
        getSupportFragmentManager().beginTransaction().replace(R.id.detail_fragment_container, newDetail).commit();
    }
}