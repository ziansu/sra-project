@java.lang.SuppressWarnings(value = "static-access")
@java.lang.Override
public void onDisable() {
    this.plugin = null;
    this.versions.clear();
    this.entities.clear();
    this.kickMessage = null;
    this.versionMsg = null;
    this.manager = null;
    this.minMinecraftVersion = null;
    this.maxMinecraftVersion = null;
    this.minProtocolVersion = 0;
    this.maxProtocolVersion = 0;
}