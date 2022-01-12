public com.query.maker.Entity exec(java.lang.Long id) {
    if (((this.entityClassName) == null) || ((this.method) == null)) {
        return null;
    }
    this.criteria = new com.query.maker.Criteria().addValue("id", id);
    java.util.List<com.query.maker.Entity> queryList = this.limit(1).exec();
    if (queryList.isEmpty()) {
        return null;
    }else {
        return queryList.get(0);
    }
}