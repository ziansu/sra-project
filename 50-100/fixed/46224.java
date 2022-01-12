protected com.ubikz.scraper.core.provider.db.qb.Select getBaseSelect(com.ubikz.scraper.core.app.dal.filter.AbstractDalFilter filter, boolean isCount) {
    com.ubikz.scraper.core.provider.db.qb.QueryBuilder qb = new com.ubikz.scraper.core.provider.db.qb.QueryBuilder();
    com.ubikz.scraper.core.provider.db.qb.Select select = qb.select().from(this.tableName);
    if (isCount) {
        select.columns("COUNT(DISTINCT id)");
    }
    this.parseFilter(filter, select, isCount);
    return select;
}