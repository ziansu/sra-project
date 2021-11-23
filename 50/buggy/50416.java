public void setContactSelection(ch.unibe.ese.calendar.User user, boolean selected) {
    myContacts.remove(user);
    myContacts.put(user, selected);
}