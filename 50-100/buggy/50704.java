public static boolean validate(org.ebayopensource.turmeric.services.repositoryservice.impl.CreateCompleteAssetRequest createCompleteAssetRequest, java.util.List<org.ebayopensource.turmeric.common.v1.types.CommonErrorData> errorDataList) {
    boolean isValid = true;
    if (createCompleteAssetRequest != null) {
        isValid = org.ebayopensource.turmeric.services.repositoryservice.operation.util.RepositoryServiceOperationValidationUtil.validateAssetInfo(createCompleteAssetRequest.getAssetInfo(), errorDataList);
        if ((createCompleteAssetRequest.getCaptureTemplateName()) == null) {
            errorDataList.add(org.ebayopensource.turmeric.runtime.common.exceptions.ErrorDataFactory.createErrorData(ErrorConstants.CAPTURE_TEMPLATE_NOT_RESOLVED, ErrorConstants.ERRORDOMAIN));
            isValid = false;
        }
    }else {
        errorDataList.add(org.ebayopensource.turmeric.runtime.common.exceptions.ErrorDataFactory.createErrorData(ErrorConstants.NO_REQUEST_PARAM, ErrorConstants.ERRORDOMAIN));
        isValid = false;
    }
    return isValid;
}