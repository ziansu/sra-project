public void deleteEvent(s3.thisisbetter.model.Event e, java.lang.String eventID) {
    if (!(values.contains(e))) {
        return ;
    }
    boolean haveResponded = e.getInvitedHaveResponded().get(s3.thisisbetter.model.DB.getMyUID());
    if (haveResponded) {
        (numRespondedTo)--;
    }else {
        (numAwaitingResponse)--;
    }
    this.remove(e);
    eventIDToObject.remove(eventID);
}