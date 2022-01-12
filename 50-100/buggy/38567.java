public java.lang.String getShortTagImageURL() {
    java.lang.String url;
    if ((isTagImageAvailable()) == false) {
        url = "/mijngod/javax.faces.resource/NoPhotoAvailable.jpg.jsf?ln=images";
        return url;
    }
    url = getFullTagImageURL();
    url = url.substring(1);
    url = url.substring(url.indexOf('/'));
    return url;
}