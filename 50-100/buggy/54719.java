private void spawnHunter() {
    de.teamlapen.vampirism.entity.hunter.EntityBasicHunter hunter = new de.teamlapen.vampirism.entity.hunter.EntityBasicHunter(village.world);
    boolean flag = de.teamlapen.lib.lib.util.UtilLib.spawnEntityInWorld(village.world, getBoundingBox(), hunter, 5);
    if (flag) {
        hunter.makeVillageHunter(this);
    }else {
        hunter.setDead();
    }
    VampirismMod.log.t("Spawning Vampire Hunter %s", flag);
}