@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    selectedCategory = parent.getItemAtPosition(position).toString();
    android.widget.Toast.makeText(parent.getContext(), ("Selected: " + (selectedCategory)), Toast.LENGTH_LONG).show();
}