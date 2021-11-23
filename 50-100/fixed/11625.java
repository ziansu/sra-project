public void followUser() {
    com.firebase.client.Firebase fb = com.stazo.project_18.Project_18.getFB();
    if (Project_18.me.getUserTrails().contains(user_ID)) {
        Project_18.me.removeTrail(fb, user_ID);
        setFollowButton(false);
    }else {
        Project_18.me.addTrail(fb, user_ID);
        setFollowButton(true);
    }
}