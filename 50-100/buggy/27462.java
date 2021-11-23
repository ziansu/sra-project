@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent evt) {
    int res = de.mpa.client.ui.dialogs.AdvancedSettingsDialog.showDialog(de.mpa.client.ui.ClientFrame.getInstance(), "Result Processing Settings", true, de.mpa.client.Client.getInstance().getResultParameters());
    if (res != (de.mpa.client.ui.dialogs.AdvancedSettingsDialog.DIALOG_CANCELLED)) {
        if ((dbSearchResult.isRaw()) || (res == (de.mpa.client.ui.dialogs.AdvancedSettingsDialog.DIALOG_CHANGED_ACCEPTED))) {
            new de.mpa.client.ui.panels.ResultsPanel.ProcessResultsTask().execute();
        }
    }
}