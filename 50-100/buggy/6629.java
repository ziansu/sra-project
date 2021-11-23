public int unpin(tachyon.TachyonURI path) throws java.io.IOException {
    try {
        mTfs.setPin(mTfs.open(path), true);
        java.lang.System.out.println((("File '" + path) + "' was successfully unpinned."));
        return 0;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println((("File '" + path) + "' could not be unpinned."));
        return -1;
    }
}