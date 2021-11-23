@java.lang.Override
public void showChooseDate(java.util.Calendar calendar, int id) {
    int year = calendar.get(java.util.Calendar.YEAR);
    int month = calendar.get(java.util.Calendar.MONTH);
    int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    com.ricardo.casarez.flightsearch.view.fragments.DatePickerDialogFragment datePickerFragment = com.ricardo.casarez.flightsearch.view.fragments.DatePickerDialogFragment.newInstance(id, year, month, day);
    datePickerFragment.setTargetFragment(this, com.ricardo.casarez.flightsearch.view.fragments.SearchFlightsFragment.DATE_PICKER_DIALOG_REQUEST_CODE);
    datePickerFragment.show(getActivity().getSupportFragmentManager(), DatePickerDialogFragment.TAG);
}