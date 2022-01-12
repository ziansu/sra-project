public com.nasceniaco.domain.model.RecommendationResultsSet findTopKRecommendationByUser(java.lang.Long id) throws java.lang.Exception {
    return recommendationSystemService.findTopKRecommendationByUser(id, 0);
}