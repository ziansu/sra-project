@java.lang.SuppressWarnings(value = "unchecked")
public net.imglib2.img.Img<net.imglib2.type.numeric.integer.UnsignedByteType> ReadImageG8(final java.lang.String fname) throws java.io.IOException {
    net.imglib2.img.Img<?> img = __ReadImage(fname);
    if (!((img.firstElement()) instanceof net.imglib2.type.numeric.integer.UnsignedByteType)) {
        log.error(("Error reading file: " + fname));
        throw new java.io.IOException("Images are expected to have 8-bit gray voxels.");
    }
    log.info(("Loaded image: " + fname));
    return ((net.imglib2.img.Img<net.imglib2.type.numeric.integer.UnsignedByteType>) (img));
}