public static boolean addBuff(net.minecraft.world.World world, net.minecraft.entity.EntityLivingBase entity, net.darkhax.bookshelf.buff.BuffEffect effect) {
    if (entity != null) {
        if (net.darkhax.bookshelf.buff.BuffHelper.hasBuff(entity, effect.getBuff())) {
            if (!(world.isRemote))
                net.darkhax.bookshelf.common.EntityProperties.getProperties(entity).remove(effect);
            
        }
        if (!(world.isRemote))
            net.darkhax.bookshelf.common.EntityProperties.getProperties(entity).add(effect);
        
        return true;
    }
    return false;
}