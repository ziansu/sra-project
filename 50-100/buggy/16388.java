public java.util.List<org.oscarehr.common.model.Allergy> findByProviderDemographicLastUpdateDate(java.lang.String providerNo, java.lang.Integer demographicId, java.util.Calendar updatedAfterThisDateExclusive, int itemsToReturn) {
    java.lang.String sqlCommand = ("select x from " + (modelClass.getSimpleName())) + " x where x.demographicNo=?1 and x.lastUpdateDate>?2 order by x.lastUpdateDate";
    javax.persistence.Query query = entityManager.createQuery(sqlCommand);
    query.setParameter(1, demographicId);
    query.setParameter(2, updatedAfterThisDateExclusive);
    setLimit(query, itemsToReturn);
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<org.oscarehr.common.model.Allergy> results = query.getResultList();
    return results;
}