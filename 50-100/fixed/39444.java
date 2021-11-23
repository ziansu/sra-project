@java.lang.Override
public void loadPlayer(com.github.unchama.player.GiganticPlayer gp, java.sql.ResultSet rs) throws java.sql.SQLException {
    com.github.unchama.player.toolpouch.ToolPouchManager m = gp.getManager(com.github.unchama.player.toolpouch.ToolPouchManager.class);
    org.bukkit.inventory.Inventory pouch;
    try {
        pouch = com.github.unchama.util.BukkitSerialization.getInventoryfromBase64(rs.getString("pouchdata").toString());
        m.setPouch(pouch);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}