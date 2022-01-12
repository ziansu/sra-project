public void changeOwner(final java.lang.String placeid, final java.lang.String id) throws de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.NotForSaleException, de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.PlaceNotFoundException, de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.PlayerDoesntExistsException {
    getPlayer(id);
    final de.haw_hamburg.vs_ws2015.spahl_haug.brocker_rest.dto.Place place = getPlace(placeid);
    if (((place.getOwner()) != null) && (place.getOwner().equals("NotForSale"))) {
        throw new de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.NotForSaleException("Not for sale");
    }
    place.setOwner(id);
}