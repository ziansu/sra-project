@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String temp = selectedFromValue;
    selectedFromValue = currenciesData[position];
    if (spinnerToValue.equals(selectedFromValue)) {
        spinnerToValue = temp;
        spinner_to.setSelection(spinnerAdapter_to.getPosition(spinnerToValue));
    }
    spinner_from.setSelection(spinnerAdapter_from.getPosition(selectedFromValue));
    updateResults(input_To, selectedFromValue);
}