private void renderNameCell(final org.sonar.wsclient.services.Measure measure, int row, int column) {
    com.google.gwt.user.client.ui.Anchor link = new com.google.gwt.user.client.ui.Anchor(measure.getRuleName());
    link.setName(measure.getRuleKey());
    link.setTitle(measure.getRuleName());
    link.getElement().setPropertyObject("measure", measure);
    link.addClickHandler(this);
    getGrid().setWidget(row, column, link);
}