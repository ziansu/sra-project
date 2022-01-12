public static void reset() {
    micdoodle8.mods.galacticraft.core.util.MapUtil.currentMap = null;
    micdoodle8.mods.galacticraft.core.util.MapUtil.queuedMaps.clear();
    micdoodle8.mods.galacticraft.core.util.MapUtil.calculatingMap.set(false);
    micdoodle8.mods.galacticraft.core.util.MapUtil.doneOverworldTexture = false;
}