private boolean confirmed(org.gradoop.common.model.impl.pojo.Vertex salesQuotation) {
    java.util.List<java.lang.Float> influencingMasterQuality = com.google.common.collect.Lists.newArrayList();
    influencingMasterQuality.add(getEdgeTargetQuality("sentBy", salesQuotation.getId(), Constants.EMPLOYEE_MAP));
    influencingMasterQuality.add(getEdgeTargetQuality("sentTo", salesQuotation.getId(), Constants.CUSTOMER_MAP));
    return config.happensTransitionConfiguration(influencingMasterQuality, "SalesQuotation", "confirmationProbability");
}