private void addTrip(zotzp.flygogo.Trip thisTrip) {
    if (!(this.edit)) {
        this.key = mDatabase.child("trips").push().getKey();
        thisTrip.id = key;
    }
    mDatabase.child("trips").child(key).setValue(thisTrip);
    android.content.Intent myIntent = new android.content.Intent(this, zotzp.flygogo.UserTripsActivity.class);
    startActivity(myIntent);
}