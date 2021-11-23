@org.springframework.web.bind.annotation.RequestMapping(value = { "index" , "europeana-sitemap-index-hashed.xml" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String handleSitemapIndex(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException {
    try {
        return service.getFileContent(eu.europeana.sitemap.web.SitemapReadController.INDEX_FILE);
    } catch (eu.europeana.sitemap.exceptions.SiteMapNotFoundException e) {
        eu.europeana.sitemap.web.SitemapReadController.LOG.error("Sitemap index file not found", e);
        response.sendError(HttpServletResponse.SC_NOT_FOUND);
        return null;
    }
}