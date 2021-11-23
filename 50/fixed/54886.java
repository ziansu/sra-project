public org.giiwa.forum.bean.Follower getFollower(org.giiwa.framework.bean.User u) {
    if (u == null) {
        return null;
    }
    return org.giiwa.forum.bean.Follower.load(org.giiwa.core.bean.Helper.W.create("cid", this.getId()).and("uid", u.getId()));
}