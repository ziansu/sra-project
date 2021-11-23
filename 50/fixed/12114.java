public boolean delURL(java.lang.String website) {
    if (URLs.toString().contains(website)) {
        URLs.remove(URLs.toString().indexOf(website));
        return true;
    }
    return false;
}