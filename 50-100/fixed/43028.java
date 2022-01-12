private net.morbz.minecraft.world.Section getSection(int y, boolean create) {
    int sectionY = y / (Section.SECTION_HEIGHT);
    net.morbz.minecraft.world.Section section = sections[sectionY];
    if ((section == null) && create) {
        section = new net.morbz.minecraft.world.Section(this, sectionY);
        sections[sectionY] = section;
    }
    return section;
}