private static boolean isGzipped(java.io.File file) {
    return file.getName().endsWith(uk.ac.bbsrc.tgac.miso.notification.util.PossiblyGzippedFileUtils.GZIP_EXTENSION);
}