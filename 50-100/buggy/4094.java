public static void initWrite() throws java.sql.SQLException {
    java.sql.Connection writeConnection = RealisticBiomes.plugin.getPlantManager().getWriteConnection();
    com.untamedears.realisticbiomes.persist.ChunkWriter.deleteOldDataStmt = writeConnection.prepareStatement(java.lang.String.format("DELETE FROM %s_plant WHERE chunkid = ?", com.untamedears.realisticbiomes.persist.ChunkWriter.curConfig.prefix));
    com.untamedears.realisticbiomes.persist.ChunkWriter.addChunkStmt = writeConnection.prepareStatement(java.lang.String.format("INSERT INTO %s_chunk (w, x, z) VALUES (?, ?, ?)", com.untamedears.realisticbiomes.persist.ChunkWriter.curConfig.prefix));
    com.untamedears.realisticbiomes.persist.ChunkWriter.getLastChunkIdStmt = writeConnection.prepareStatement("SELECT LAST_INSERT_ID()");
    com.untamedears.realisticbiomes.persist.ChunkWriter.addPlantStmt = writeConnection.prepareStatement(java.lang.String.format("INSERT INTO %s_plant (chunkid, w, x, y, z, date, growth, fruitGrowth) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", com.untamedears.realisticbiomes.persist.ChunkWriter.curConfig.prefix));
    com.untamedears.realisticbiomes.persist.ChunkWriter.deleteOldPlantsStmt = writeConnection.prepareStatement(java.lang.String.format("DELETE FROM %s_plant WHERE chunkid = ?", com.untamedears.realisticbiomes.persist.ChunkWriter.curConfig.prefix));
}