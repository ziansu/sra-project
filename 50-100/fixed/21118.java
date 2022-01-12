private void setSkyLight(int x, int y, int z, byte light) {
    net.morbz.minecraft.world.Section section = getSection(y, false);
    if (section != null) {
        int blockY = y % (Section.SECTION_HEIGHT);
        section.setSkyLight(x, blockY, z, light);
    }
}