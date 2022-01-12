@java.lang.Override
public void onClick(android.view.View v) {
    if ((((((yearInput) == 0) || ((monthInput) == 0)) || ((dayInput) == 0)) || ((hourInput) == 0)) || ((minuteInput) == 0)) {
        android.widget.Toast.makeText(this, "Enter Time and/or Date first", Toast.LENGTH_LONG).show();
    }else {
        mCallApiButton.setEnabled(false);
        getResultsFromApi();
        mCallApiButton.setEnabled(true);
    }
}