private io.phobotic.vultus.reslotter.logistics.SlottableItem getBestItem(int level) {
    int levelZ = bay.getTotalHeightUpToLevel(level);
    int levelHeight = bay.getLevelHeight(level);
    return getBestItemForZAndHeight(levelZ, levelHeight);
}