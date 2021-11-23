@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String temp = spinnerToValue;
    spinnerToValue = currenciesData[position];
    if (selectedFromValue.equals(spinnerToValue)) {
        selectedFromValue = temp;
        spinner_from.setSelection(spinnerAdapter_from.getPosition(selectedFromValue));
    }
    spinner_to.setSelection(spinnerAdapter_to.getPosition(spinnerToValue));
    updateResults(input_To, spinnerToValue);
}