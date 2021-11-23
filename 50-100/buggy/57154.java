@java.lang.Override
public java.util.List<org.nextprot.api.core.domain.PublicationDbXref> findDbXRefByPublicationIds(java.util.List<java.lang.Long> publicationIds) {
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<>();
    params.put("publicationIds", publicationIds);
    return new org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate(dsLocator.getDataSource()).query(sqlDictionary.getSQLQuery("dbxref-by-publication-ids"), params, new org.nextprot.api.core.dao.impl.DbXrefDaoImpl.PublicationDbXRefRowMapper());
}