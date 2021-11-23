private void showNoDefinedReportTemplateForConditionError() {
    tabSheet.removeTab(tabSheet.getTab(PDFTabLayout));
    tabSheet.setSelectedTab(0);
    view.showErrorMessage(com.constellio.app.ui.i18n.i18n.$("ReportTabButton.noReportTemplateForCondition"));
}