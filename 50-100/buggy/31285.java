public void addAttendee(java.lang.Long id, ro.sci.group2.domain.User user) {
    ro.sci.group2.domain.Meeting meeting = dao.findById(id);
    java.util.Collection<ro.sci.group2.domain.User> attendees = meeting.getAttendees();
    attendees.add(user);
    meeting.setAttendees(attendees);
    dao.update(meeting);
}