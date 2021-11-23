public boolean delURL(java.lang.String website) {
    if (URLs.contains(website)) {
        URLs.remove(URLs.indexOf(website));
        return true;
    }
    return false;
}