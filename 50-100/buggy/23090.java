public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    java.lang.System.out.println(((((month + "/") + day) + "/") + year));
    android.widget.Button dateButton = ((android.widget.Button) (this.getActivity().findViewById(R.id.date)));
    dateButton.setText(((((month + "/") + day) + "/") + year));
}