public static void initRead(java.sql.Connection readConnection) throws java.sql.SQLException {
    com.untamedears.realisticbiomes.persist.ChunkWriter.loadPlantsStmt = readConnection.prepareStatement(java.lang.String.format("SELECT w, x, y, z, date, growth, fruitGrowth FROM %s_plant WHERE chunkid = ?", com.untamedears.realisticbiomes.persist.ChunkWriter.curConfig.prefix));
}