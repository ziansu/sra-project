public boolean isHTML5supported() {
    if (((name) != null) && ((version) != null)) {
        double browserVersion = java.lang.Double.parseDouble(version);
        if ((("Mozilla".equals(name)) && (browserVersion < 10)) || (("IE".equals(name)) && (browserVersion < 10))) {
            return false;
        }
    }
    return true;
}