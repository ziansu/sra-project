public void deOrganizeDeveloperMeeting() {
    for (nl.saxion.maurens.company.Person person : devMeetingUsers) {
        person.endMeeting();
    }
    devMeetingUsers.clear();
    nl.saxion.maurens.utility.LogUtil.log("dev meeting ended");
}