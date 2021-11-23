@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String temp = selectedFromValue;
    if (spinnerToValue.equals(currenciesData[position]))
        spinnerToValue = temp;
    
    selectedFromValue = currenciesData[position];
    spinner_to.setSelection(spinnerAdapter_to.getPosition(spinnerToValue));
    spinner_from.setSelection(spinnerAdapter_from.getPosition(selectedFromValue));
    updateResults(input_To, selectedFromValue);
}