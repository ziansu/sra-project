public de.tohemi.justparty.datamodel.event.Event getEvent(final int id, java.lang.String mail) {
    de.tohemi.justparty.datamodel.event.Event event = null;
    try {
        event = de.tohemi.justparty.database.controller.DBEventController.getInstance().getEventById(id);
        event.setEventOwner(de.tohemi.justparty.datamodel.user.UserFactory.create(mail));
        final java.util.List<de.tohemi.justparty.datamodel.UserEventRelation> guestlist = getGuestlist(id, mail);
        java.util.Collections.sort(guestlist);
        event.setGuests(guestlist);
    } catch (java.net.MalformedURLException | de.tohemi.justparty.datamodel.exceptions.InvalidEmailException | de.tohemi.justparty.datamodel.exceptions.ZipCodeInvalidException e) {
        de.tohemi.justparty.businesslogic.EventsHandlerImpl.LOGGER.logException(e, "");
    }
    return event;
}