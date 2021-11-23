public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    ((com.example.ecrvn.tasks.DatePickerFragment.OnDatePickerFragmentInteractionListener) (getActivity())).onDateConfirmed(((((year + "-") + (month + 1)) + "-") + day));
}