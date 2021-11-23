@java.lang.Override
public com.appdirect.backend.core.entities.Event createEvent(com.appdirect.backend.core.entities.Event data) {
    com.appdirect.backend.core.services.impl.EventServiceImpl.LOG.trace("ENTER createEvent()");
    com.appdirect.backend.core.entities.Event event = eventRepo.findEvent(data.getId());
    if (event != null) {
        throw new com.appdirect.backend.core.services.exceptions.EventExistsException();
    }
    try {
        return eventRepo.createEvent(data);
    } finally {
        com.appdirect.backend.core.services.impl.EventServiceImpl.LOG.trace("EXIT createEvent()");
    }
}