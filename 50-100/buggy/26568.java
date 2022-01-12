public java.util.List<partypeople.PartyPeopleUser> getAttending() {
    java.util.ArrayList<partypeople.PartyPeopleUser> attendees = new java.util.ArrayList<partypeople.PartyPeopleUser>();
    if ((attending) != null) {
        for (com.googlecode.objectify.Ref<partypeople.PartyPeopleUser> attendee : attending) {
            attendees.add(attendee.safeGet());
        }
    }
    return attendees;
}