private com.vaadin.ui.VerticalLayout getReportsSection() {
    com.vaadin.ui.VerticalLayout reportSection = new com.vaadin.ui.VerticalLayout();
    com.example.components.ReportList reportList = new com.example.components.ReportList("", eventRouter);
    reportSection.addComponent(reportList);
    return reportSection;
}