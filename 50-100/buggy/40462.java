public void populateDbView() {
    ruleArray = dbManager.getRulesArray();
    if (ruleArray.isEmpty()) {
        android.widget.Toast.makeText(getApplicationContext(), "You have no saved rules to view", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.ArrayAdapter<com.mhmt.autotextmate.dataobjects.Rule> arrayAdapter = new android.widget.ArrayAdapter<com.mhmt.autotextmate.dataobjects.Rule>(this, android.R.layout.simple_list_item_1, dbManager.getRulesArray());
        ruleListView.setAdapter(arrayAdapter);
    }
}