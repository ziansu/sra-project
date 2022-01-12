public void onSpawningComplete(net.minecraft.entity.EntityLivingBase entity) {
    java.lang.String oldTag = entity.getEntityData().getString(atomicstryker.infernalmobs.common.InfernalMobsCore.instance().getNBTTag());
    if (!(oldTag.equals(getLinkedModNameUntranslated()))) {
        java.lang.System.out.printf("Infernal Mobs tag mismatch!! Was [%s], now trying to set [%s] \n", oldTag, getLinkedModNameUntranslated());
    }
    entity.getEntityData().setString(atomicstryker.infernalmobs.common.InfernalMobsCore.instance().getNBTTag(), getLinkedModNameUntranslated());
}