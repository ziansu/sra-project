@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position != 0) {
        if (position == ((areaNames.size()) - 1)) {
            showAddOtherAreaDialog();
        }
    }
}