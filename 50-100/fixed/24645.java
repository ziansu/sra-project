@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    for (int i = 0; i < (allurl.size()); i++) {
        allurl.add(null);
        if (i == (spinnericon.getSelectedItemPosition())) {
            icon = allurl.get(i);
        }
    }
}