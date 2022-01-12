@java.lang.Override
public void crawlSite() {
    this.numberOfExtractredItems = 0;
    for (java.lang.String catalogueUrl : catalogueUrls) {
        try {
            crawlCatalogue(catalogueUrl);
        } catch (java.io.IOException exp) {
            try {
                crawlCatalogue((catalogueUrl + "/f"));
            } catch (java.io.IOException ex) {
                log.debug("This link doesn't exist: {}", (catalogueUrl + ex));
            }
        }
    }
}