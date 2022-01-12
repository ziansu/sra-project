public java.lang.String getImageURL() {
    if (((media) == null) || (media.isEmpty())) {
        return null;
    }
    return media.get(0).getImageURL();
}