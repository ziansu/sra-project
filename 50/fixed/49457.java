@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (id != (spinnerPos)) {
        spinnerPos = ((int) (id));
        updateMethodIcon(position);
    }
}