public static void reload(org.bukkit.entity.Player player, me.desht.chesscraft.chess.BoardView view) {
    boolean restored = false;
    try {
        me.desht.chesscraft.blocks.TerrainBackup tb = new me.desht.chesscraft.blocks.TerrainBackup(player, view);
        tb.reloadTerrain();
        restored = true;
    } catch (com.sk89q.worldedit.FilenameException e) {
        me.desht.chesscraft.log.ChessCraftLogger.log(java.util.logging.Level.WARNING, e.getMessage());
    }
    if (!restored) {
        view.wipe();
    }
}