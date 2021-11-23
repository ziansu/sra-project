@java.lang.Override
public boolean handle(java.lang.Object data) {
    orgomg.cwm.foundation.softwaredeployment.DataManager dataManager = ((orgomg.cwm.foundation.softwaredeployment.DataManager) (data));
    if (org.talend.cwm.db.connection.ConnectionUtils.checkConnection(dataManager, getAnalysisHandler().getAnalysis().getName())) {
        openColumnsSelectionDialog(dataManager);
        resetSelectKeyButton();
    }
    return true;
}