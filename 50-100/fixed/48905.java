public void refreshRiders(com.lasergiraffe.rideshare.Note note) {
    android.os.Bundle extra = getIntent().getExtras();
    int noteCurrNumRiders = note.getCurrNumRiders();
    android.widget.TextView numSeatsText = ((android.widget.TextView) (findViewById(R.id.numSeats_id)));
    int noteCapacity = extra.getInt(getString(R.string.noteCapacity));
    java.lang.String totalSeatsAvailable = ((noteCurrNumRiders + "/") + noteCapacity) + "  Seats Available";
    numSeatsText.setText(totalSeatsAvailable);
}