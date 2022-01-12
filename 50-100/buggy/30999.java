private <S> org.springframework.data.mongodb.core.query.Criteria createFilterCriteria(final java.lang.String filterName, final java.util.List<S> filterValues, final org.devgateway.ocds.web.rest.controller.request.DefaultFilterPagingRequest filter) {
    if (filterValues == null) {
        return new org.springframework.data.mongodb.core.query.Criteria();
    }
    return filter.getInvert() ? org.springframework.data.mongodb.core.query.Criteria.where(filterName).not().in(filterValues.toArray()) : org.springframework.data.mongodb.core.query.Criteria.where(filterName).in(filterValues.toArray());
}