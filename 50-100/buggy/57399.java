@java.lang.SuppressWarnings(value = "unchecked")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<org.springframework.hateoas.PagedResources<com.github.reflectoring.infiniboard.quartermaster.dashboard.rest.DashboardResource>> getAllDashboards(@org.springframework.data.web.PageableDefault
org.springframework.data.domain.Pageable pageable, org.springframework.data.web.PagedResourcesAssembler pagedResourcesAssembler) {
    org.springframework.data.domain.Page<com.github.reflectoring.infiniboard.quartermaster.dashboard.domain.Dashboard> dashboardsPage = repository.findAll(pageable);
    org.springframework.hateoas.PagedResources<com.github.reflectoring.infiniboard.quartermaster.dashboard.rest.DashboardResource> pagedResources = pagedResourcesAssembler.toResource(dashboardsPage, dashboardResourceAssembler);
    return new org.springframework.http.ResponseEntity(pagedResources, org.springframework.http.HttpStatus.OK);
}