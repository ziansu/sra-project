@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    java.lang.String infrm = (((("You birthday is: " + dayOfMonth) + ".") + (monthOfYear + 1)) + ".") + year;
    android.widget.TextView tv = ((android.widget.TextView) (getActivity().findViewById(R.id.text_date)));
    tv.setText(infrm);
}