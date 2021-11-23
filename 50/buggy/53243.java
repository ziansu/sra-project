private void logReportMenuActionPerformed(java.awt.event.ActionEvent evt) {
    new com.compomics.util.gui.error_handlers.BugReport(this, lastSelectedFolder, "SearchGUI", "searchgui", new eu.isas.searchgui.gui.Properties().getVersion(), "peptide-shaker", "PeptideShaker", new java.io.File(((eu.isas.searchgui.gui.SearchGUI.getJarFilePath()) + "/resources/SearchGUI.log")));
}