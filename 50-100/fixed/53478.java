public void displayResults() {
    mainViewPort.mask(AppPropertiesManager.CONSTANTS.defaultmask());
    ch.systemsx.sybit.crkwebui.client.commons.services.eppic.CrkWebServiceProvider.getServiceController().getResultsOfProcessing(ch.systemsx.sybit.crkwebui.client.commons.appdata.ApplicationContext.getSelectedJobId());
    if ((ch.systemsx.sybit.crkwebui.client.commons.appdata.ApplicationContext.getSelectedViewType()) == (ch.systemsx.sybit.crkwebui.client.results.gui.panels.ResultsPanel.ASSEMBLIES_VIEW)) {
        displayResultView(ch.systemsx.sybit.crkwebui.client.commons.appdata.ApplicationContext.getPdbInfo(), ResultsPanel.ASSEMBLIES_VIEW);
        ResultsPanel.headerPanel.pdbIdentifierPanel.informationLabel.setHTML("Assembly Analysis of: ");
        ResultsPanel.headerPanel.pdbIdentifierPanel.pdbNameLabel.setHTML(ch.systemsx.sybit.crkwebui.client.commons.appdata.ApplicationContext.getPdbInfo().getPdbCode());
    }
}