protected boolean isMariaDbCapableTlsv12() {
    if (!(isMariaDbServer())) {
        return false;
    }
    if (versionGreaterOrEqual(10, 0, 15)) {
        return true;
    }
    if (((majorVersion) != 10) && (versionGreaterOrEqual(5, 5, 41))) {
        return true;
    }
    return false;
}