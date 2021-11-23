@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if (!(i == (-1))) {
        childRegistryYear = spinnerYears.get((i - 1));
    }
}