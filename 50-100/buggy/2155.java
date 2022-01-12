public org.sentilo.web.catalog.domain.Performance getCurrentPerformance() {
    final org.springframework.data.domain.Pageable pageable = new org.springframework.data.domain.PageRequest(0, 1, org.springframework.data.domain.Sort.Direction.DESC, "timestamp");
    final org.sentilo.web.catalog.search.SearchFilter filter = new org.sentilo.web.catalog.search.SearchFilter(pageable);
    if (org.sentilo.web.catalog.context.TenantContextHolder.hasContext()) {
        filter.addAndParam("tenant", org.sentilo.web.catalog.utils.TenantUtils.getCurrentTenant());
    }
    final org.sentilo.web.catalog.search.SearchFilterResult<org.sentilo.web.catalog.domain.Performance> result = search(filter);
    return org.springframework.util.CollectionUtils.isEmpty(result.getContent()) ? null : result.getContent().get(0);
}