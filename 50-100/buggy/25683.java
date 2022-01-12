@com.intrafind.sitesearch.controller.RequestMapping(path = "{siteId}/pages/url/{url}", method = RequestMethod.GET)
org.springframework.http.ResponseEntity<com.intrafind.sitesearch.dto.FetchedPage> fetchViaUrl(@com.intrafind.sitesearch.controller.PathVariable(value = "siteId")
java.util.UUID siteId, @com.intrafind.sitesearch.controller.PathVariable(value = "url")
java.net.URI url) throws java.io.UnsupportedEncodingException {
    java.lang.String pageId = com.intrafind.sitesearch.dto.Page.hashPageId(siteId, java.net.URLDecoder.decode(url.toString(), "UTF-8"));
    java.util.Optional<com.intrafind.sitesearch.dto.FetchedPage> fetched = service.fetchById(pageId);
    if (fetched.isPresent()) {
        return org.springframework.http.ResponseEntity.ok(fetched.get());
    }else {
        return org.springframework.http.ResponseEntity.notFound().build();
    }
}