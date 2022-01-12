private void CreateQGIS_FromPrj() {
    final java.lang.String filename = y.utils.YemFileDialogs.fileDialog(this, y.config.LastUsedFolder.getInstance(), "Seleziona il file prj da cui creare il progetto qgis");
    if (!(filename.isEmpty()))
        try {
            final y.em.Project prj = y.exporters.ProjectExporterProvider.importProject(filename);
            final y.ui.PanelProject pp = OpenProject(prj);
            y.ui.PanelQGisCreate.openWindow(config, pp);
        } catch (java.lang.Exception e) {
            y.utils.Utils.MessageBox(this, ("Impossibile aprire il file di progetto:\n" + (e.getMessage())), "ERRORE");
        }
    
}