public y.ui.PanelProject OpenProject(y.em.Project prj) {
    try {
        final y.ui.PanelProject pp = y.ui.PanelProject.Open(config, this, prj);
        openPanelProject(pp);
        return pp;
    } catch (java.lang.Exception e) {
        y.utils.Utils.MessageBox(this, ("Si \ufffd verificato un errore aprendo il file del progetto:\n" + (e.getMessage())), "Impossibile aprire il progetto.");
        return null;
    }
}