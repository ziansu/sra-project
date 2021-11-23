public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent myIntent = new android.content.Intent(getApplicationContext(), com.attender.Event_Page_Activity.class);
    myIntent.putExtra("CurrentEvent", events.get(position));
    startActivity(myIntent);
}