void onActivate(java.lang.Long eventId) {
    this.eventId = eventId;
    if ((userSession.getEventoId()) == null)
        userSession.setEventoId(eventId);
    else
        if ((userSession.getEventoId().compareTo(eventId)) != 0) {
            userSession.setBetType(null);
            userSession.setOptions(new java.util.ArrayList<es.udc.pojoapp.model.option.Option>());
            userSession.setEventoId(eventId);
        }
    
}