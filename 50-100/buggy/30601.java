@java.lang.Override
public void updatePhysics(net.glowstone.block.GlowBlock me) {
    super.updatePhysics(me);
    boolean powered = (me.isBlockPowered()) || (me.isBlockIndirectlyPowered());
    if (powered != ((me.getType()) == (org.bukkit.Material.REDSTONE_LAMP_ON))) {
        me.setType((powered ? org.bukkit.Material.REDSTONE_LAMP_ON : org.bukkit.Material.REDSTONE_LAMP_OFF));
    }
}