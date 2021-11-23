public void kill() {
    for (com.builtbroken.icbm.content.launcher.controller.remote.antenna.TileAntennaPart tile : this) {
        tile.network = null;
    }
    this.clear();
    base = null;
}