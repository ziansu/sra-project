private java.lang.Boolean AddShortURL() {
    url.CreateLink short_link = new url.CreateLink(this.row);
    this.shortURL = short_link.encodeLongURL();
    long hashURL = short_link.getShortURLHash();
    try {
        this.insertFactory.insertShortLink(hashURL, this.shortURL, this.row);
    } catch (java.lang.Exception e) {
        helper.Loghandler.log(("trying to insert the url " + (e.toString())), "fatal");
        return false;
    }
    return true;
}