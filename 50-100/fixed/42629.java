@java.lang.Override
public java.lang.String filterProperty(java.lang.String valueToBeFiltered, org.apache.tamaya.spi.FilterContext context) {
    if (context.isSinglePropertyScoped()) {
        for (org.apache.tamaya.spi.PropertyFilter pred : org.apache.tamaya.filter.ConfigurationFilter.THREADED_SINGLE_FILTERS.get().getFilters()) {
            valueToBeFiltered = pred.filterProperty(valueToBeFiltered, context);
        }
    }else {
        for (org.apache.tamaya.spi.PropertyFilter pred : org.apache.tamaya.filter.ConfigurationFilter.THREADED_MAP_FILTERS.get().getFilters()) {
            valueToBeFiltered = pred.filterProperty(valueToBeFiltered, context);
        }
    }
    return valueToBeFiltered;
}