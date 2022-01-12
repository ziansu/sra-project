private void setIntentData() {
    android.os.Bundle extras = getIntent().getExtras();
    destination = extras.getString(de.roughriders.jf.eta.activities.TripActivity.DESTINATION_EXTRA);
    destinationTextView.setText(destination);
    phoneNumber = extras.getString(de.roughriders.jf.eta.activities.TripActivity.PHONE_NUMBER_EXTRA);
    if (extras.containsKey(de.roughriders.jf.eta.activities.TripActivity.NAME_EXTRA))
        name = extras.getString(de.roughriders.jf.eta.activities.TripActivity.NAME_EXTRA);
    else
        name = phoneNumber;
    
    nameTextView.setText(name);
    progressBar.setMax(java.lang.Integer.MAX_VALUE);
}