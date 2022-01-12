private void spreadSkylightDownwards(int x, int z) {
    final int highestBlock = getHighestBlock(x, z);
    final int sectionY = highestBlock / (Section.SECTION_HEIGHT);
    byte light = World.DEFAULT_SKY_LIGHT;
    for (int y = sectionY; y >= 0; --y) {
        final net.morbz.minecraft.world.Section section = sections[sectionY];
        if (section != null) {
            light = section.spreadSkylightDownwards(x, z, light);
            if (light == 0) {
                break;
            }
        }
    }
}