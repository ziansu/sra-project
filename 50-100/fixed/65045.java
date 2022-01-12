private void populateCriteriaValueMapsInReverseOrder(java.util.List<java.util.Map<java.lang.String, website.automate.jwebrobot.model.CriteriaValue>> criteriaValueMaps, java.util.Map<java.lang.String, website.automate.jwebrobot.model.CriteriaValue> criteriaValueMap) {
    website.automate.jwebrobot.model.CriteriaValue parentCriterion = criteriaValueMap.get(CriteriaType.PARENT.getName());
    if (parentCriterion != null) {
        populateCriteriaValueMapsInReverseOrder(criteriaValueMaps, parentCriterion.asMap());
    }
    criteriaValueMaps.add(criteriaValueMap);
}