@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != (spinnerPos)) {
        spinnerPos = position;
        updateMethodIcon(position);
    }
}