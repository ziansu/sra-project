public void organizeUserMeeting(nl.saxion.maurens.company.ProductOwner productOwner) {
    userMeetingUsers.add(developer.remove());
    userMeetingUsers.add(productOwner);
    userMeetingUsers.addAll(getProductUsers());
    nl.saxion.maurens.utility.LogUtil.log(("users in meeting" + (java.util.Arrays.toString(userMeetingUsers.toArray()))));
    releaseAllDevelopers();
    releaseAllMeetingUsers();
}