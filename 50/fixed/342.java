public static y.ui.PanelProject Open(final y.config.Config config, final y.ui.WindowMain main, y.em.Project prj, java.lang.String filename) throws java.lang.Exception {
    if (prj == null)
        throw new java.lang.Exception("Internal Error: you can't create a PanelProject with an empty project");
    
    return new y.ui.PanelProject(config, main, prj, filename);
}