@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    java.lang.String tmp = mTextViewBirthday.getText().toString();
    java.lang.String[] arr = tmp.split("/");
    int year = java.lang.Integer.parseInt(arr[com.example.framgia.hrm_10.controller.time.DatePickerFragment.YEAR]);
    int month = java.lang.Integer.parseInt(arr[com.example.framgia.hrm_10.controller.time.DatePickerFragment.MONTH]);
    int day = java.lang.Integer.parseInt(arr[com.example.framgia.hrm_10.controller.time.DatePickerFragment.DAY]);
    return new android.app.DatePickerDialog(getActivity(), this, year, month, day);
}