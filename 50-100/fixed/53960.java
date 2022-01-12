@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    label = parent.getItemAtPosition(position).toString();
    pos = position;
    android.widget.Toast.makeText(parent.getContext(), ((getString(R.string.dialog_selection)) + (label)), Toast.LENGTH_LONG).show();
}