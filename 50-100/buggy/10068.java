@java.lang.Override
public byte[] openBytes(int no, byte[] buf, int x, int y, int w, int h) throws java.io.IOException, loci.formats.FormatException {
    loci.formats.FormatTools.checkPlaneParameters(this, no, buf.length, x, y, w, h);
    int planeSize = loci.formats.FormatTools.getPlaneSize(this);
    pixelFile.seek(((pixelOffset) + (no * planeSize)));
    readPlane(pixelFile, x, y, w, h, buf);
    return buf;
}