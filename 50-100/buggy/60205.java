public static boolean isHerobrineMob(org.bukkit.entity.Entity entity) {
    if (one.lindegaard.MobHunting.compatibility.HerobrineCompat.isSupported()) {
        return (((entity.hasMetadata(one.lindegaard.MobHunting.compatibility.HerobrineCompat.MH_HEROBRINEMOBS)) || (one.lindegaard.MobHunting.compatibility.HerobrineCompat.entityManager.isCustomMob(entity.getEntityId()))) || ((entity.getEntityId()) == (Herobrine.herobrineNPC.getBukkitEntity().getEntityId()))) || (one.lindegaard.MobHunting.compatibility.HerobrineCompat.api.getEntityManager().isCustomMob(entity.getEntityId()));
    }
    return false;
}