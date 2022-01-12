private boolean checkDirs() {
    if ((!(mTmpPath.exists())) && (!(mTmpPath.mkdirs()))) {
        java.lang.System.out.println("Could not create TMP folder.");
        return false;
    }
    if ((!(mCsvPath.exists())) && (mCsvPath.mkdirs())) {
        java.lang.System.out.println("Could not create CSV folder.");
        return false;
    }
    return true;
}