public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    ((android.widget.TextView) (getActivity().findViewById(R.id.date_textview))).setText((((((java.lang.String.format(java.util.Locale.US, "%02d", (month + 1))) + "-") + (java.lang.String.format("%02d", day))) + "-") + (java.lang.String.valueOf(year))));
}