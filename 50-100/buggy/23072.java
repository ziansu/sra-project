public void setNameEvent(java.lang.String nameEvent) throws exception.EventException {
    if ((!(nameEvent.isEmpty())) && (nameEvent != null)) {
        if ((nameEvent.length()) < (model.Event.MAX_LENGTH_NAME)) {
            this.nameEvent = nameEvent;
        }else {
            throw new exception.EventException(model.Event.NAME_CANT_BE_GREATER_THAN_50);
        }
    }else {
        throw new exception.EventException(model.Event.EVENT_NAME_CANT_BE_EMPTY_NAME);
    }
}