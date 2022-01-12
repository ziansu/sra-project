public com.excilys.dao.util.QueryBuilder limit(java.lang.String limit) {
    queryContent.append("LIMIT ").append(limit).append(" ");
    return this;
}