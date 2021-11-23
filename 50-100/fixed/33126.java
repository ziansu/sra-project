@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/records")
@javax.ws.rs.Produces(value = { uk.gov.register.presentation.representations.ExtraMediaType.TEXT_HTML , javax.ws.rs.core.MediaType.APPLICATION_JSON , uk.gov.register.presentation.representations.ExtraMediaType.TEXT_YAML , uk.gov.register.presentation.representations.ExtraMediaType.TEXT_CSV , uk.gov.register.presentation.representations.ExtraMediaType.TEXT_TSV , uk.gov.register.presentation.representations.ExtraMediaType.TEXT_TTL })
public uk.gov.register.presentation.view.EntryListView records(@javax.ws.rs.QueryParam(value = Pagination.INDEX_PARAM)
java.util.Optional<java.lang.Long> pageIndex, @javax.ws.rs.QueryParam(value = Pagination.SIZE_PARAM)
java.util.Optional<java.lang.Long> pageSize) {
    uk.gov.register.presentation.resource.Pagination pagination = new uk.gov.register.presentation.resource.Pagination(pageIndex, pageSize, queryDAO.getTotalRecords());
    setNextAndPreviousPageLinkHeader(pagination);
    getFileExtension().ifPresent(( ext) -> addContentDispositionHeader((((requestContext.getRegisterPrimaryKey()) + "-records.") + ext)));
    return viewFactory.getRecordsView(queryDAO.getLatestEntriesOfRecords(pagination.pageSize(), pagination.offset()), pagination);
}