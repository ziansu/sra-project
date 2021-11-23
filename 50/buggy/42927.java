static boolean overwrite(java.io.File src, java.io.File dst) {
    return (dst.delete()) && (src.renameTo(dst));
}