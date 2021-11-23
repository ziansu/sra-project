@java.lang.Override
public java.util.Set<java.lang.String> getAdditionalCriteria() {
    java.util.Set<java.lang.String> additionalCriteriaSet = new java.util.HashSet<java.lang.String>();
    java.lang.String additionalMatchingCriteriaString = configService.getByNameEmpty("map_plan_status_addition_course_matching_criteria");
    if (!(org.apache.commons.lang.StringUtils.isEmpty(additionalMatchingCriteriaString.trim()))) {
        java.lang.String[] criteria = additionalMatchingCriteriaString.split(",");
        for (java.lang.String string : criteria) {
            additionalCriteriaSet.add(string.toUpperCase().trim());
        }
    }
    return additionalCriteriaSet;
}