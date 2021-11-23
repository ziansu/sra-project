private com.constellio.app.modules.rm.ui.pages.cart.Button buildPrintMetadataReportButton() {
    com.constellio.app.ui.framework.buttons.report.ReportGeneratorButton reportGeneratorButton = new com.constellio.app.ui.framework.buttons.report.ReportGeneratorButton(com.constellio.app.ui.i18n.i18n.$("ReportGeneratorButton.buttonText"), com.constellio.app.ui.i18n.i18n.$("ReportGeneratorButton.windowText"), this, getConstellioFactories().getAppLayerFactory(), getCollection(), com.constellio.app.ui.pages.management.Report.PrintableReportListPossibleView.ANY);
    return reportGeneratorButton;
}