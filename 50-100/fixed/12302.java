public void sendMessage(android.view.View v) {
    android.content.Intent searchIntent = new android.content.Intent(this, com.bminor.officebarkaroake.PerformSearchActivity.class);
    android.widget.EditText parm = ((android.widget.EditText) (findViewById(R.id.editText_searchText)));
    java.lang.String queryString = parm.getText().toString();
    java.lang.String typeString = determineCheckedButton();
    queryString.trim();
    if ((determineCheckedButton()) == "all")
        queryString = "true";
    
    searchIntent.putExtra(com.bminor.officebarkaroake.MainActivity.SEARCH_TYPE, typeString);
    searchIntent.putExtra(com.bminor.officebarkaroake.MainActivity.SEARCH_STRING, queryString);
    startActivity(searchIntent);
}