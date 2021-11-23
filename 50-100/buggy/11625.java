public void followUser() {
    com.firebase.client.Firebase fb = com.stazo.project_18.Project_18.getFB();
    if (Project_18.me.getUserTrails().contains(user_ID)) {
        Project_18.me.removeTrail(fb, user_ID);
        setFollowButton(false);
    }else {
        Project_18.me.addTrail(fb, user_ID);
        com.stazo.project_18.Notification not = new com.stazo.project_18.Notification(Project_18.me.getID(), Project_18.me.getName(), 0);
        not.pushToFirebase(fb, user_ID);
        setFollowButton(true);
    }
}