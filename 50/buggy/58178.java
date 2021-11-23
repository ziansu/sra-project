private void showTimePickerDialog(android.view.View view) {
    android.support.v4.app.DialogFragment showTime = new com.example.framgia.hrm_10.controller.time.DatePickerFragment().setTextViewBirthday(mTextViewBirthday);
    showTime.show(getSupportFragmentManager(), Settings.DATE_PICKER);
}