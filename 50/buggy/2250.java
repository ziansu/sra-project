public void disableIfNotCompatible() {
    if (!(compatible)) {
        this.onDisable();
        this.getPluginLoader().disablePlugin(this);
    }
}