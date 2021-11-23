@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    ((android.widget.EditText) (alertView.findViewById(R.id.et_od))).setText(((((dayOfMonth + ".") + monthOfYear) + ".") + year));
}