public static void init(com.feed_the_beast.ftbl.api.IFTBLibRegistry reg) {
    java.lang.String id = (com.feed_the_beast.ftbu.FTBUFinals.MOD_ID) + ".world";
    reg.addConfig(id, "chunk_claiming", com.feed_the_beast.ftbu.config.FTBUConfigWorld.CHUNK_CLAIMING);
    reg.addConfig(id, "chunk_loading", com.feed_the_beast.ftbu.config.FTBUConfigWorld.CHUNK_LOADING);
    reg.addConfig(id, "safe_spawn", com.feed_the_beast.ftbu.config.FTBUConfigWorld.SAFE_SPAWN);
    reg.addConfig(id, "spawn_area_in_sp", com.feed_the_beast.ftbu.config.FTBUConfigWorld.SPAWN_AREA_IN_SP);
    reg.addConfig(id, "log_chunkloading", com.feed_the_beast.ftbu.config.FTBUConfigWorld.LOG_CHUNKLOADING);
}