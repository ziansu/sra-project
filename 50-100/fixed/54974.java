@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode != (android.app.Activity.RESULT_OK)) {
        return ;
    }
    if (requestCode == (com.example.ebrooke.criminalintent.CrimeFragment.REQUEST_DATE)) {
        java.util.Date date = ((java.util.Date) (data.getSerializableExtra(DatePickerFragment.EXTRA_DATE)));
        mCrime.setDate(date);
        updateDate();
    }
}