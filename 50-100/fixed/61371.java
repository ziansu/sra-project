public static com.google.common.collect.Multimap<java.lang.String, java.lang.String> getFiltersForFunction(java.lang.String filterString) {
    com.google.common.collect.Multimap<java.lang.String, java.lang.String> filters;
    if (org.apache.commons.lang3.StringUtils.isNotBlank(filterString)) {
        filters = com.linkedin.thirdeye.util.ThirdEyeUtils.getFilterSet(filterString);
    }else {
        filters = com.google.common.collect.HashMultimap.create();
    }
    return filters;
}