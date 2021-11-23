void assignSlug(ca.primat.shorturl.model.ShortUrl shortUrl) {
    if ((shortUrl != null) && ((shortUrl.getId()) >= 0)) {
        shortUrl.setSlug(base62Service.encode(shortUrl.getId()));
    }
}