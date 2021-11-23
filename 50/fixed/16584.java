public com.query.maker.Entity one() {
    java.util.List<com.query.maker.Entity> queryList = this.limit(1).exec();
    if (queryList.isEmpty()) {
        return null;
    }else {
        return queryList.get(0);
    }
}