public void createCheckListView() {
    java.lang.String[] itemTextDisplay = com.example.boss.lesson4_alarm_clock.MainActivity.getItemsTextToDisplay();
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(this, R.layout.item_check_delete, R.id.chTextView, itemTextDisplay);
    listView = ((android.widget.ListView) (findViewById(R.id.listView)));
    listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    if ((listView) != null) {
        listView.setAdapter(adapter);
    }
}