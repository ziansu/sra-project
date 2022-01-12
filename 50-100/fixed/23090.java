public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    android.widget.Button dateButton = ((android.widget.Button) (this.getActivity().findViewById(R.id.date)));
    dateButton.setText((((((month + 1) + "/") + day) + "/") + year));
}