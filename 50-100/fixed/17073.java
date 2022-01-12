@java.lang.Override
protected void fillData() {
    java.lang.String min_people = etMinPeople.getText().toString();
    java.lang.String max_people = etMaxPeople.getText().toString();
    if (min_people.equals(""))
        min_people = "1";
    
    if (max_people.equals(""))
        max_people = "1";
    
    data.putString("min_people", escapeString(min_people));
    data.putString("max_people", escapeString(max_people));
    data.putInt("ages", rgAges.getCheckedRadioButtonId());
}