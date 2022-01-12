public void populateSpinner() {
    android.widget.Spinner spinner = ((android.widget.Spinner) (findViewById(R.id.date_spinner)));
    android.widget.ArrayAdapter<java.lang.CharSequence> adapter = android.widget.ArrayAdapter.createFromResource(getApplicationContext(), R.array.within_last_days_array, android.R.layout.simple_spinner_dropdown_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(this);
    adapter.notifyDataSetChanged();
    spinner.setSelection(((adapter.getCount()) - 1));
}