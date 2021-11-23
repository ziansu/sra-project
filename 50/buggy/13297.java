private static org.ebayopensource.turmeric.services.repositoryservice.impl.CreateCompleteAssetRequest getCreateCompleteAssetRequest(org.ebayopensource.turmeric.services.repositoryservice.impl.CreateAndSubmitAssetRequest createAndSubmitAssetRequest) {
    org.ebayopensource.turmeric.services.repositoryservice.impl.CreateCompleteAssetRequest createCompleteAssetRequest = new org.ebayopensource.turmeric.services.repositoryservice.impl.CreateCompleteAssetRequest();
    createCompleteAssetRequest.setAssetInfo(createAndSubmitAssetRequest.getAssetInfo());
    createCompleteAssetRequest.setCaptureTemplateName(createAndSubmitAssetRequest.getCaptureTemplateName());
    return createCompleteAssetRequest;
}