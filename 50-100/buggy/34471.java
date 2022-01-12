@java.lang.Override
public void onClick(android.view.View v) {
    if (!(hasNotEnteredAllDetails())) {
        android.util.Log.i(iti_edu.battuta.EditTripActivity.TAG, ("isEditingTrip: " + (isEditingTrip)));
        if (isEditingTrip) {
            editTripData();
        }else {
            addTripData();
        }
        android.content.Intent returnIntent = new android.content.Intent();
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Some fields are required!", Toast.LENGTH_SHORT).show();
    }
}