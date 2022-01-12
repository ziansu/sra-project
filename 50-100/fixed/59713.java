public void updateFromJar(org.openstreetmap.josm.plugins.PluginInformation other) {
    updateLocalInfo(other);
    if ((other.icon) != null) {
        this.icon = other.icon;
    }
    this.early = other.early;
    this.className = other.className;
    this.canloadatruntime = other.canloadatruntime;
    this.libraries = other.libraries;
    this.stage = other.stage;
    this.file = other.file;
}