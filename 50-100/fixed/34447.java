private java.util.List<com.ciandt.techgallery.service.model.Response> getRecommendationsByTechnologyUserAndScore(java.lang.String technologyId, com.google.appengine.api.users.User user, java.lang.Boolean score) {
    java.util.List<com.ciandt.techgallery.service.model.Response> recommendationsUpTO = new java.util.ArrayList<com.ciandt.techgallery.service.model.Response>();
    for (com.ciandt.techgallery.service.model.Response recommendation : getRecommendations(technologyId, user)) {
        com.ciandt.techgallery.service.model.TechnologyRecommendationTO recommendationTO = ((com.ciandt.techgallery.service.model.TechnologyRecommendationTO) (recommendation));
        if (recommendationTO.getScore().equals(score)) {
            recommendationsUpTO.add(recommendationTO);
        }
    }
    return recommendationsUpTO;
}