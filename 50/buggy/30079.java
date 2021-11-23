public play.mvc.Result selectedEvent(java.lang.String name) {
    return ok(event.render(name));
}