@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.mahovd.bignerdranch.criminalintent.Crime crime = mCrimes.get(position);
    return com.mahovd.bignerdranch.criminalintent.CrimeFragment.newInstance(crime.getId(), false);
}