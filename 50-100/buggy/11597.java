private void setPlaceGuess(java.lang.String placeGuess) {
    placeGuess = placeGuess.trim();
    if ((placeGuess != null) && ((placeGuess.length()) > 0)) {
        mLocationGuess.setText(placeGuess);
        mObservation.place_guess = placeGuess;
    }else {
        mLocationGuess.setText(R.string.set_location);
        mObservation.place_guess = null;
    }
}