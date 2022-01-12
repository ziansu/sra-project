public boolean copy() {
    boolean res = false;
    try {
        res = net.sf.jabref.logic.util.io.FileUtil.copyFile(file, tmpFile, true);
    } catch (java.io.IOException ex) {
        net.sf.jabref.collab.FileUpdateMonitor.LOGGER.info((("Cannot copy to temporary file '" + (tmpFile.getPath())) + '\''), ex);
    }
    return res;
}