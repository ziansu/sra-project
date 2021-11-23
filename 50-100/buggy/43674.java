private java.lang.String getRemote() {
    elegit.Git git = new elegit.Git(this.repo);
    elegit.StoredConfig config = git.getRepository().getConfig();
    java.util.Set<java.lang.String> remotes = config.getSubsections("remote");
    if ((remotes.size()) == 1) {
        return ((java.lang.String) (remotes.toArray()[0]));
    }
    return elegit.PopUpWindows.pickRemoteToPushTo(remotes);
}