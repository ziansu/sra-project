@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    if ((chosenManufacturer) == 0) {
        android.support.design.widget.Snackbar.make(spinnerManufacturer.getRootView(), "Please choose your camera Manufacturer", Snackbar.LENGTH_LONG).show();
    }
}