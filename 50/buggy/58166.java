public void addFollowing(User us) {
    us.addFollower(this);
    following.add(us);
}