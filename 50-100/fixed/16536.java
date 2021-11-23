@java.lang.Override
public void onDisable() {
    try {
        if ((players) != null) {
            players.removeAllPlayers();
        }
        if ((grid) != null) {
            grid.saveGrid();
        }
        com.wasteofplastic.askyblock.WarpSigns.saveWarpList();
        if ((messages) != null) {
            messages.saveMessages();
        }
        com.wasteofplastic.askyblock.TopTen.topTenSave();
    } catch (final java.lang.Exception e) {
        getLogger().severe("Something went wrong saving files!");
        e.printStackTrace();
    }
}