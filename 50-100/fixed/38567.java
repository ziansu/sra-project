public java.lang.String getShortTagImageURL() {
    if ((isTagImageAvailable()) == false) {
        return "/mijngod/javax.faces.resource/NoPhotoAvailable.jpg.jsf?ln=images";
    }
    java.lang.String url = getFullTagImageURL();
    url = url.substring(1);
    url = url.substring(url.indexOf('/'));
    return url;
}