static boolean overwrite(java.io.File src, java.io.File dst) {
    boolean result = dst.delete();
    result = (src.renameTo(dst)) && result;
    return result;
}