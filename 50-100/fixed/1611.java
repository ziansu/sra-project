public static byte[] toCompressedBytes(@javax.annotation.Nonnull
final java.io.Externalizable obj) throws java.io.IOException {
    hivemall.utils.io.FastMultiByteArrayOutputStream bos = new hivemall.utils.io.FastMultiByteArrayOutputStream();
    final java.util.zip.DeflaterOutputStream dos = new java.util.zip.DeflaterOutputStream(bos);
    try {
        hivemall.utils.lang.ObjectUtils.toStream(obj, dos);
        return bos.toByteArray_clear();
    } finally {
        hivemall.utils.io.IOUtils.closeQuietly(dos);
    }
}