public java.util.List<io.github.xsocks.model.Profile> getAllProfile() {
    profiles = reloadAll();
    return (profiles) == null ? null : profiles.getProfiles();
}