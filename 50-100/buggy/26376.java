private gov.nysenate.openleg.client.response.base.BaseResponse getNewTranscriptsDuring(java.time.LocalDateTime from, java.time.LocalDateTime to, org.springframework.web.context.request.WebRequest request) {
    gov.nysenate.openleg.dao.base.LimitOffset limOff = getLimitOffset(request, 25);
    com.google.common.collect.Range<java.time.LocalDateTime> range = getOpenRange(to, from, "from", "to");
    gov.nysenate.openleg.dao.base.PaginatedList<gov.nysenate.openleg.model.transcript.TranscriptUpdateToken> updates = transcriptDao.transcriptsUpdatedDuring(range, SortOrder.ASC, limOff);
    return gov.nysenate.openleg.client.response.base.ListViewResponse.of(updates.getResults().stream().map(TranscriptUpdateTokenView::new).collect(java.util.stream.Collectors.toList()), updates.getTotal(), limOff);
}