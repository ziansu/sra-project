@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    determineTip(spinnerCountry.getSelectedItem().toString());
    setCurrencySymbol(spinnerCountry.getSelectedItem().toString());
}