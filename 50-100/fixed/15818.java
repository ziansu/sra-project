@java.lang.Override
public net.minecraft.util.EnumFacing getElectricInputDirection() {
    if (this.isMaster) {
        return this.facing.getOpposite();
    }
    micdoodle8.mods.galacticraft.planets.asteroids.tile.TileEntityMinerBase master = this.getMaster();
    if (master != null) {
        return master.facing.getOpposite();
    }
    return null;
}