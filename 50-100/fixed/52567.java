public void Open(java.lang.String filename) {
    if (!(filename.isEmpty()))
        try {
            OpenProject(y.exporters.ProjectExporterProvider.importProject(filename), filename);
        } catch (java.lang.Exception e) {
            y.utils.Utils.MessageBox(this, ("Impossibile aprire il progetto:\n" + (e.toString())), "ERRORE");
        }
    
}