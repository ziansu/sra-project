public static models.Rate create(int score, java.lang.Long userId, java.lang.Long criteriaId, java.lang.Long projectId) {
    if ((models.Rate.findByUserIdAndProjectIdAndCriteriaId(userId, projectId, criteriaId)) == null) {
        models.Rate rate = new models.Rate();
        rate.score = score;
        rate.userId = userId;
        rate.criteriaId = criteriaId;
        rate.projectId = projectId;
        rate.save();
        return rate;
    }
    models.Rate rate = models.Rate.findByUserIdAndProjectIdAndCriteriaId(userId, projectId, criteriaId);
    rate.score = score;
    rate.update();
    return rate;
}