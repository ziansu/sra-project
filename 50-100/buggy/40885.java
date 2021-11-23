public void organizeUserMeeting(nl.saxion.maurens.company.ProductOwner productOwner) {
    userMeetingUsers.add(developer.remove());
    userMeetingUsers.add(productOwner);
    userMeetingUsers.addAll(getProductUsers());
    releaseAllDevelopers();
    releaseAllMeetingUsers();
    nl.saxion.maurens.utility.LogUtil.log(("users in meeting" + (java.util.Arrays.toString(userMeetingUsers.toArray()))));
}