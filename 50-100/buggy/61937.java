@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        hideKeyboard();
        InspectionDatesFragment.viewID = v.getId();
        android.app.DialogFragment newFragment = new com.ets.gd.Utils.DatePickerFragmentEditText();
        newFragment.show(getActivity().getFragmentManager(), "Date Picker");
    }else {
    }
}