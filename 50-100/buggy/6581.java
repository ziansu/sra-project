@java.lang.Override
public synchronized net.torocraft.toroquest.civilization.Province register(int chunkX, int chunkZ) {
    java.lang.System.out.println((((("register [" + chunkX) + "][") + chunkZ) + "]"));
    net.torocraft.toroquest.civilization.Province province = atLocation(chunkX, chunkZ);
    if (province != null) {
        updateExistingProvince(province, chunkX, chunkZ);
    }else {
        province = buildNewProvince(chunkX, chunkZ);
    }
    markDirty();
    return province;
}