public laser.ddg.ProvenanceData getCurrentDDG() {
    laser.ddg.gui.DDGPanel curDDGPanel = laser.ddg.gui.DDGExplorer.getCurrentDDGPanel();
    if (curDDGPanel == null) {
        laser.ddg.gui.WorkflowPanel wfPanel = laser.ddg.gui.DDGExplorer.getCurrentWorkflowPanel();
        return wfPanel.getProvData();
    }else {
        return curDDGPanel.getProvData();
    }
}