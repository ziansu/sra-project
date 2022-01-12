static int getNextMeetingId() {
    if ((ContactManager.Manager.meetings.size()) < 1)
        return 100;
    
    int highestId = ContactManager.Manager.findMeeting(0).getId();
    for (int i = 1; i < ((ContactManager.Manager.meetings.size()) - 1); i++) {
        if ((ContactManager.Manager.findMeeting(i).getId()) > highestId) {
            highestId = ContactManager.Manager.findContact(i).getId();
        }
    }
    return highestId + 1;
}