protected org.kohsuke.github.GHUser getUser(org.kohsuke.github.GHUser orig) throws java.io.IOException {
    org.kohsuke.github.GHUser u = users.get(orig.getLogin());
    if (u == null) {
        orig.root = this;
        users.put(login, orig);
        return orig;
    }
    return u;
}