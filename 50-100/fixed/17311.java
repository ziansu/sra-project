@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add_goal);
    android.widget.Spinner dropdown = ((android.widget.Spinner) (findViewById(R.id.spinner)));
    java.lang.String[] dropdownList = new java.lang.String[]{ "Hours" , "Days" , "Weeks" , "Months" , "Dollars" , "Repititions" , "Other" };
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, dropdownList);
    dropdown.setAdapter(adapter);
}