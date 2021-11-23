private void extractInfo(org.jsoup.select.Elements elements, org.joda.time.format.DateTimeFormatter dtf) {
    this.dateReport = com.danimaniarqsoft.brain.util.DateUtils.convertDateToString(new java.util.Date(), dtf);
    org.jsoup.nodes.Element dateEndPlannedElement = elements.get(0).getAllElements().get(5);
    this.setDateEndPlanned(dateEndPlannedElement.text());
    this.setDateForecast(com.danimaniarqsoft.brain.pdes.model.InfoReportTable.readForeCast(elements));
}