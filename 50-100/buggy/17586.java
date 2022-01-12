void computeProjectPanels() throws java.sql.SQLException {
    ctl.loadProjects();
    projectPnls = new java.util.ArrayList<gui.ProjectPanel>();
    for (int i = 0; i < (ctl.getProjects().size()); i++) {
        gui.ProjectPanel pnl = new gui.ProjectPanel(ctl.getProjects().get(i), this, ctl);
        pnl.changeStatus(ctl.getProjects().get(i).getStatus());
        projectPnls.add(pnl);
    }
}