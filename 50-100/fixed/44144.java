protected void populateSubCategoryDetails() {
    for (org.egov.tl.entity.LicenseSubCategoryDetails scDetails : subCategoryMappingDetails) {
        if (scDetails != null) {
            scDetails.setSubCategory(subCategory);
            scDetails.setFeeType(feeTypeService.findById(scDetails.getFeeType().getId()));
            scDetails.setRateType(scDetails.getRateType());
            scDetails.setUom(unitOfMeasurementService.findById(scDetails.getUom().getId()));
            subCategory.addLicenseSubCategoryDetails(scDetails);
        }
    }
}