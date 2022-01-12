public web.crawler.db.model.Index getIndexByTerm(java.lang.String term) {
    org.springframework.data.mongodb.core.query.Query findQuery = new org.springframework.data.mongodb.core.query.Query();
    findQuery.addCriteria(org.springframework.data.mongodb.core.query.Criteria.where("term").is(term));
    web.crawler.db.model.Index dbIndex = mongoOperation.findOne(findQuery, web.crawler.db.model.Index.class, DBTable.INDEX);
    return dbIndex;
}