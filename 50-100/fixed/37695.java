protected org.akaza.openclinica.dao.submit.ListSubjectFilter getListSubjectFilter(org.jmesa.limit.Limit limit) {
    org.akaza.openclinica.dao.submit.ListSubjectFilter listSubjectFilter = new org.akaza.openclinica.dao.submit.ListSubjectFilter(getDateFormat());
    org.jmesa.limit.FilterSet filterSet = limit.getFilterSet();
    java.util.Collection<org.jmesa.limit.Filter> filters = filterSet.getFilters();
    for (org.jmesa.limit.Filter filter : filters) {
        java.lang.String property = filter.getProperty();
        java.lang.String value = filter.getValue();
        listSubjectFilter.addFilter(property, value);
    }
    return listSubjectFilter;
}