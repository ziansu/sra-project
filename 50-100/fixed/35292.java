public boolean isStarredImport() {
    java.lang.String ret = importName.trim();
    if (ret.endsWith(";")) {
        ret = ret.substring(0, ((ret.length()) - 1)).trim();
    }
    return ret.endsWith(".*");
}