protected void parseFilter(com.ubikz.scraper.core.app.dal.filter.AbstractDalFilter filter, com.ubikz.scraper.core.provider.db.qb.AbstractQuery select) {
    com.ubikz.scraper.core.app.dal.filter.FeedTypeDalFilter feedTypeDalFilter = ((com.ubikz.scraper.core.app.dal.filter.FeedTypeDalFilter) (filter));
    super.parseFilter(feedTypeDalFilter, select);
    if (((feedTypeDalFilter.getIdList()) != null) && ((feedTypeDalFilter.getIdList().size()) > 0)) {
        select.where("id", "in", feedTypeDalFilter.getIdList());
    }
}