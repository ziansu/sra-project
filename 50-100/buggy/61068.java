public com.classes.Place newPlace(java.lang.String placeName, int xPos, int yPos) throws java.lang.IllegalArgumentException {
    if (!(checkPlaceName(placeName))) {
        throw new java.lang.IllegalArgumentException();
    }
    com.classes.Place place = new com.classes.PlaceImpl(placeName, xPos, yPos);
    if (!(places.add(place))) {
        throw new java.lang.IllegalArgumentException();
    }
    return place;
}