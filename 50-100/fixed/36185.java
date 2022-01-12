public java.util.List<ua.nure.entities.TariffCommentary> findByTariffId(int id) {
    java.util.List<ua.nure.entities.TariffCommentary> comment = mongoOperations.find(new org.springframework.data.mongodb.core.query.Query().addCriteria(org.springframework.data.mongodb.core.query.Criteria.where("tariffId").is(id)), ua.nure.entities.TariffCommentary.class);
    java.util.List<ua.nure.entities.TariffCommentary> result = new java.util.ArrayList<>();
    for (ua.nure.entities.TariffCommentary t : comment) {
        if ((t.isDeleted()) == false)
            result.add(t);
        
    }
    return result;
}