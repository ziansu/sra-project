public void joinEvent(final android.view.View view) {
    if (((event.getParticipantIds().size()) <= 1) && (event.getParticipantIds().values().toArray()[0].equals(fireUser.getUid()))) {
        deleteEvent(null);
    }else
        if (userAlreadyParticipates()) {
            leaveEvent();
        }else {
            addUserToEvent();
        }
    
}