@java.lang.Override
public com.appdirect.backend.core.entities.Event createEvent(com.appdirect.backend.core.entities.Event data) {
    com.appdirect.backend.core.services.impl.EventServiceImpl.LOG.trace("ENTER createEvent()");
    try {
        if ((data.getId()) == null) {
            return eventRepo.createEvent(data);
        }else {
            com.appdirect.backend.core.entities.Event event = eventRepo.findEvent(data.getId());
            if (event != null) {
                throw new com.appdirect.backend.core.services.exceptions.EventExistsException();
            }else {
                return eventRepo.createEvent(data);
            }
        }
    } finally {
        com.appdirect.backend.core.services.impl.EventServiceImpl.LOG.trace("ENTER createEvent()");
    }
}