private de.domisum.exziff.world.ChunkSection getSection(int icY) {
    int sectionId = icY / (ChunkSection.HEIGHT);
    de.domisum.exziff.world.ChunkSection section = this.chunkSections[sectionId];
    return section;
}