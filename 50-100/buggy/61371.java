public static com.google.common.collect.Multimap<java.lang.String, java.lang.String> getFiltersForFunction(com.linkedin.thirdeye.datalayer.dto.AnomalyFunctionDTO anomalyFunctionSpec) {
    com.google.common.collect.Multimap<java.lang.String, java.lang.String> filters;
    java.lang.String filterString = anomalyFunctionSpec.getFilters();
    if (org.apache.commons.lang3.StringUtils.isNotBlank(filterString)) {
        filters = com.linkedin.thirdeye.util.ThirdEyeUtils.getFilterSet(filterString);
    }else {
        filters = com.google.common.collect.HashMultimap.create();
    }
    return filters;
}