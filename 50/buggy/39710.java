public void removeParticipant(model.User user) {
    user.getCalendar().removeEvent(this);
    participants.remove(user);
}