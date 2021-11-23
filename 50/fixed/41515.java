public ch.entwine.weblounge.common.site.Site findSiteByIdentifier(java.lang.String identifier) {
    for (ch.entwine.weblounge.common.site.Site site : sites) {
        if (site.getIdentifier().equals(identifier)) {
            return site;
        }
    }
    return null;
}