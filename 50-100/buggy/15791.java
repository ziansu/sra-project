public java.util.List<eu.europa.ec.fisheries.uvms.rules.service.business.fact.FishingActivityFact> generateFactForFishingActivities(java.util.List<un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FishingActivity> fishingActivities, un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FAReportDocument faReportDocument) {
    if (fishingActivities == null) {
        return java.util.Collections.emptyList();
    }
    java.util.List<eu.europa.ec.fisheries.uvms.rules.service.business.fact.FishingActivityFact> list = new java.util.ArrayList<>();
    for (un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._20.FishingActivity fishingActivity : fishingActivities) {
        list.add(generateFactForFishingActivity(fishingActivity, faReportDocument));
    }
    return list;
}