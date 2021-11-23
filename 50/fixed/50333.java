private java.lang.String getEaWorldSaveName(net.minecraft.world.World w) {
    return (((mods.eln.misc.Utils.getMapFolder()) + "data/electricalAgeWorld") + (w.provider.dimensionId)) + ".dat";
}