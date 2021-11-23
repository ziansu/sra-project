@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = com.example.savagavran.criminalintent.DatePickerActivity.newIntent(getActivity(), mCrime.getDate());
    startActivityForResult(intent, com.example.savagavran.criminalintent.CrimeFragment.REQUEST_DATE);
}