public static void loadMobs() {
    com.turkey.turkeyUtil.Mobs.UtilMobs.createEntity(com.turkey.turkeyUtil.Mobs.EntityTurkey.class, TurkeyUtilSettings.TurkeyEntityID, "Turkey", 5384448, 15108608);
    com.turkey.turkeyUtil.Mobs.UtilMobs.createEntity(com.turkey.turkeyUtil.Mobs.EntityDuck.class, TurkeyUtilSettings.DuckEntityID, "Duck", 10900224, 21248);
    com.turkey.turkeyUtil.Mobs.UtilMobs.createEntity(com.turkey.turkeyUtil.Mobs.EntityRhea.class, TurkeyUtilSettings.RheaEntityID, "Rhea", 2692096, 6897686);
    com.turkey.turkeyUtil.Mobs.UtilMobs.createEntity(com.turkey.turkeyUtil.Mobs.EntityVoxel.class, TurkeyUtilSettings.VoxelEntityID, "Voxel", 10066329, 15461355);
    com.turkey.turkeyUtil.Mobs.UtilMobs.createHostileEntity(com.turkey.turkeyUtil.Mobs.EntityDamageSkeleton.class, TurkeyUtilSettings.DamageSkeltonEntityID, "Damage_Skeleton", 13421772, 8388608);
}