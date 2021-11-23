@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String selectedItemText = ((java.lang.String) (parent.getItemAtPosition(position)));
    if (position > 0) {
        category = selectedItemText;
    }
}