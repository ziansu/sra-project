private void setAdditionalObjects(eu.europa.ec.fisheries.uvms.rules.service.config.BusinessObjectType businessObjectType, java.lang.Object businessObject, eu.europa.ec.fisheries.uvms.rules.service.business.generator.AbstractGenerator generator) {
    if (BusinessObjectType.FLUX_ACTIVITY_REQUEST_MSG.equals(businessObjectType)) {
        generator.setAdditionalValidationObject(ruleAssetsBean.getAssetList(businessObject), AdditionalValidationObjectType.ASSET_LIST);
        generator.setAdditionalValidationObject(activityService.getNonUniqueIdsList(businessObject), AdditionalValidationObjectType.ACTIVITY_NON_UNIQUE_IDS);
        generator.setAdditionalValidationObject(activityService.getFishingActivitiesForTrips(businessObject), AdditionalValidationObjectType.ACTIVITY_WITH_TRIP_IDS);
    }
}