@java.lang.Override
public net.minecraft.util.EnumFacing getElectricInputDirection() {
    if (this.isMaster) {
        java.lang.System.err.println(this.facing);
        return this.facing.getOpposite();
    }
    micdoodle8.mods.galacticraft.planets.asteroids.tile.TileEntityMinerBase master = this.getMaster();
    if (master != null) {
        java.lang.System.err.println(this.facing);
        return master.facing.getOpposite();
    }
    return null;
}