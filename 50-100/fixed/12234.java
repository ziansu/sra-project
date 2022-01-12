public eu.eexcess.dataformats.result.ResultList generateFederatedRecommendation(eu.eexcess.dataformats.userprofile.SecureUserProfile secureUserProfile) throws java.io.FileNotFoundException {
    eu.eexcess.dataformats.result.ResultList resultList = null;
    if ((federatedRecConfiguration.sourceSelectors) != null) {
        java.util.ArrayList<java.lang.String> sourceSelectors = new java.util.ArrayList<java.lang.String>();
        java.util.Collections.addAll(sourceSelectors, federatedRecConfiguration.sourceSelectors);
        secureUserProfile = sourceSelection(secureUserProfile, sourceSelectors);
    }
    try {
        resultList = getAndAggregateResults(secureUserProfile, this.federatedRecConfiguration.defaultPickerName);
    } catch (eu.eexcess.federatedrecommender.utils.FederatedRecommenderException e) {
        eu.eexcess.federatedrecommender.FederatedRecommenderCore.logger.log(java.util.logging.Level.SEVERE, "Some error retrieving or aggregation results occured.", e);
    }
    return resultList;
}