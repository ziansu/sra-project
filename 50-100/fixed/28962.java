protected void parseIfds(int offset) {
    gov.nasa.worldwind.formats.geotiff.Subfile ifd = new gov.nasa.worldwind.formats.geotiff.Subfile(this.buffer, offset);
    this.buffer.position(offset);
    this.parseIfdFields(ifd);
    this.subfiles.add(ifd);
    int nextIfdOffset = this.readLimitedDWord();
    if (nextIfdOffset != 0) {
        this.buffer.position(nextIfdOffset);
        this.parseIfds(nextIfdOffset);
    }
}