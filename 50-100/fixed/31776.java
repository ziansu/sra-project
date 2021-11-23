private void populateListView(java.lang.String result) {
    android.widget.ListView list = ((android.widget.ListView) (findViewById(R.id.smslistview)));
    SMSArray = new java.util.ArrayList<>();
    adapter = new android.widget.ArrayAdapter(getApplicationContext(), R.layout.da_items, SMSArray);
    java.lang.String sms = result;
    adapter.add(sms);
    list.setAdapter(adapter);
    adapter.notifyDataSetChanged();
}