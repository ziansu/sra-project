@java.lang.SuppressWarnings(value = "null")
@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent evt) {
    java.util.LinkedList<java.lang.Long> expList = new java.util.LinkedList<java.lang.Long>();
    expList = de.mpa.client.ui.dialogs.SelectExperimentDialog.showDialog(de.mpa.client.ui.ClientFrame.getInstance(), "Select experiments");
    if (!(expList.isEmpty())) {
        new de.mpa.client.ui.panels.ResultsPanel.FetchResultsTask(expList).execute();
    }
}