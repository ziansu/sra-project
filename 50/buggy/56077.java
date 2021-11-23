public com.excilys.dao.util.QueryBuilder limit(int limit) {
    queryContent.append("LIMIT ").append(limit).append(" ");
    return this;
}