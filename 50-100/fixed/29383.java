@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String listItem = ((java.lang.String) (com.example.gates.phonepedometer.SetBuilder.listView.getItemAtPosition(position)));
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.gates.phonepedometer.SwimSet.class);
    i.putExtra("set", listItem);
    startActivity(i);
}