public static boolean addBuff(net.minecraft.world.World world, net.minecraft.entity.EntityLivingBase entity, net.darkhax.bookshelf.buff.BuffEffect effect) {
    if ((entity != null) && (!(world.isRemote))) {
        if (net.darkhax.bookshelf.buff.BuffHelper.hasBuff(entity, effect.getBuff())) {
            net.darkhax.bookshelf.common.EntityProperties.getProperties(entity).remove(effect, false);
        }
        net.darkhax.bookshelf.common.EntityProperties.getProperties(entity).add(effect, false);
        return true;
    }
    return false;
}