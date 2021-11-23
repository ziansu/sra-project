public int unpin(tachyon.TachyonURI path) throws java.io.IOException {
    try {
        mTfs.unpin(mTfs.open(path));
        java.lang.System.out.println((("File '" + path) + "' was successfully unpinned."));
        return 0;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println((("File '" + path) + "' could not be unpinned."));
        return -1;
    }
}