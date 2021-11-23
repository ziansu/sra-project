protected void cleanUpEvents() {
    for (com.google.web.bindery.event.shared.HandlerRegistration hr : handlers) {
        hr.removeHandler();
    }
    handlers.clear();
}