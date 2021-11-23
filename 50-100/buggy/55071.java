public synchronized org.ops4j.pax.web.service.spi.model.FilterModel removeFilter(final javax.servlet.Filter filter) {
    final org.ops4j.pax.web.service.spi.model.FilterModel model;
    java.util.Set<org.ops4j.pax.web.service.spi.model.FilterModel> models = findFilterModels(filter);
    if ((models == null) || (models.isEmpty())) {
        throw new java.lang.IllegalArgumentException((("Filter [" + filter) + " is not currently registered in any context"));
    }
    filterModels.values().removeAll(models);
    return models.iterator().next();
}