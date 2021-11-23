public void init() {
    littleMaidMobX.io.FileManager.getModFile("mmmlibx", "littleMaidMob");
    littleMaidMobX.io.FileManager.getModFile("mmmlibx", "mmmlibx");
    littleMaidMobX.io.FileManager.getModFile("mmmlibx", "ModelMulti");
    littleMaidMobX.io.FileManager.getModFile("mmmlibx", "LittleMaidMob");
    addSearch("mmmlibx", "/assets/minecraft/textures/entity/ModelMulti/", "ModelMulti_");
    addSearch("mmmlibx", "/assets/minecraft/textures/entity/littleMaid/", "ModelMulti_");
    addSearch("mmmlibx", "/assets/minecraft/textures/entity/littleMaid/", "ModelLittleMaid_");
    addSearch("mmmlibx", "/mob/ModelMulti/", "ModelMulti_");
    addSearch("mmmlibx", "/mob/littleMaid/", "ModelLittleMaid_");
}