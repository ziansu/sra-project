public boolean releaseStaleDir() {
    if (((watchKey) != null) && ((watchKey.watchable()) instanceof java.nio.file.Path)) {
        if (java.nio.file.Files.exists(((java.nio.file.Path) (watchKey.watchable())), java.nio.file.LinkOption.NOFOLLOW_LINKS)) {
            return false;
        }else {
            release();
            return false;
        }
    }
    return true;
}