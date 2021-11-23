@java.lang.Override
public java.util.List<Meeting> getFutureMeetingList(Contact contact) {
    java.util.List<Meeting> futureMeetings = null;
    for (Meeting e : meetingsList) {
        java.util.Set<Contact> receivedContacts = e.getContacts();
        for (Contact d : receivedContacts) {
            if (equalsCheck(contact, d)) {
                futureMeetings.add(e);
                break;
            }
        }
    }
    return futureMeetings;
}