private void displayDatePicker(org.apache.cordova.CallbackContext callbackContext) {
    android.app.FragmentManager manager = cordova.getActivity().getFragmentManager();
    com.plugin.datepicker.MaterialDatePickerPlugin.DatePickerFragment dialog = new com.plugin.datepicker.MaterialDatePickerPlugin.DatePickerFragment();
    dialog.show(manager, com.plugin.datepicker.MaterialDatePickerPlugin.DIALOG_DATE);
}