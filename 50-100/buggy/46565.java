public static play.mvc.Result drag(java.lang.String eventType, java.lang.String id) throws java.io.IOException {
    dto.EventTO eventTO = play.data.Form.form(dto.EventTO.class).bindFromRequest().get();
    services.GoogleAPI.updateEvent(eventTO.toGoogleEvent(id, null), eventTO.eventType);
    return ok();
}