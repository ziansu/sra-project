private void enterDataForStudyEventLinkBuilder(org.jmesa.view.html.HtmlBuilder builder, java.lang.String studyEventId, java.lang.String view) {
    java.lang.String href1 = "EnterDataForStudyEvent?eventId=" + studyEventId;
    builder.a().href(href1);
    builder.close();
    builder.append("<span border=\"0\" align=\"left\" class=\"icon icon-search\"/>");
    builder.nbsp().nbsp().a().href(href1);
    builder.close().append("View").aEnd();
}