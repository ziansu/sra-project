public void show(android.support.v4.app.FragmentManager fm, java.lang.String tag) {
    mFragmentManager = fm;
    mTag = tag;
    if ((mDatePicker) == null) {
        mDatePicker = new com.lftechnology.khop.khop.fragment.DatePickerFragment();
    }
    mDatePicker.show(fm, mTag);
}