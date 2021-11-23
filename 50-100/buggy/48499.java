@java.lang.Override
public java.util.List<org.nextprot.api.core.domain.PublicationAuthor> findAuthorsByPublicationIds(java.util.List<java.lang.Long> publicationIds) {
    org.springframework.jdbc.core.namedparam.SqlParameterSource namedParameters = new org.springframework.jdbc.core.namedparam.MapSqlParameterSource("publicationIds", publicationIds);
    return new org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate(dsLocator.getDataSource()).query(sqlDictionary.getSQLQuery("publication-authors-by-publication-ids"), namedParameters, new org.nextprot.api.core.dao.impl.AuthorDaoImpl.PublicationAuthorRowMapper());
}