public it.smartcommunitylab.gipro.model.Professional findAndUpdateBalanceProfessionalById(java.lang.String applicationId, java.lang.String professionalId) {
    org.springframework.data.mongodb.core.query.Criteria criteria = new org.springframework.data.mongodb.core.query.Criteria("applicationId").is(applicationId).and("objectId").is(professionalId);
    org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query(criteria);
    it.smartcommunitylab.gipro.model.Professional result = mongoTemplate.findOne(query, it.smartcommunitylab.gipro.model.Professional.class);
    if (result != null) {
        updateBalance(result, query);
    }
    result.setPasswordHash(null);
    return result;
}