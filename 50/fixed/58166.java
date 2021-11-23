public void addFollowing(User us) {
    if (us != (this)) {
        us.addFollower(this);
        following.add(us);
    }else {
        following.add(us);
    }
}