private void populateCriteriaValueMapsInReverseOrder(java.util.List<java.util.Map<website.automate.jwebrobot.model.CriteriaType, website.automate.jwebrobot.model.CriteriaValue>> criteriaValueMaps, java.util.Map<website.automate.jwebrobot.model.CriteriaType, website.automate.jwebrobot.model.CriteriaValue> criteriaValueMap) {
    website.automate.jwebrobot.model.CriteriaValue parentCriterion = criteriaValueMap.get(CriteriaType.PARENT);
    if (parentCriterion != null) {
        populateCriteriaValueMapsInReverseOrder(criteriaValueMaps, website.automate.jwebrobot.model.Action.getFilterCriteria(parentCriterion.asMap()));
    }
    criteriaValueMaps.add(criteriaValueMap);
}