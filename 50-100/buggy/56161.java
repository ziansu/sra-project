public void init() {
    littleMaidMobX.io.FileManager.getModFile("littleMaidMobX", "littleMaidMob");
    littleMaidMobX.io.FileManager.getModFile("littleMaidMobX", "mmmlibx");
    littleMaidMobX.io.FileManager.getModFile("littleMaidMobX", "ModelMulti");
    littleMaidMobX.io.FileManager.getModFile("littleMaidMobX", "LittleMaidMob");
    addSearch("littleMaidMobX", "/assets/minecraft/textures/entity/ModelMulti/", "ModelMulti_");
    addSearch("littleMaidMobX", "/assets/minecraft/textures/entity/littleMaid/", "ModelMulti_");
    addSearch("littleMaidMobX", "/assets/minecraft/textures/entity/littleMaid/", "ModelLittleMaid_");
    addSearch("littleMaidMobX", "/mob/ModelMulti/", "ModelMulti_");
    addSearch("littleMaidMobX", "/mob/littleMaid/", "ModelLittleMaid_");
}